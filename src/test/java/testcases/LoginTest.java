package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.ProductPage;
import utilities.DataSet;
import utilities.Driver_Setup;
import static org.testng.Assert.assertEquals;

public class LoginTest extends Driver_Setup {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Test
    public void testLoginWithValidCredentials(){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField, "standard_user");
        loginPage.writeOnElement(loginPage.passwordField, "secret_sauce");
        loginPage.clickOnElement(loginPage.loginButton);
        assertEquals(getDriver().getCurrentUrl(), productPage.productPageUrl);
    }
    @Test
    public void testLoginWithInvalidTest(){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField,"standard_user");
        loginPage.writeOnElement(loginPage.passwordField,"secret_sau");
        loginPage.clickOnElement(loginPage.loginButton);
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator),loginPage.error_msg);


    }
    @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String userName, String password){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField,userName);
        loginPage.writeOnElement(loginPage.passwordField,password);
        loginPage.clickOnElement(loginPage.loginButton);
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator),loginPage.error_msg);
    }
    @Test(dataProvider = "emptyUserName",dataProviderClass = DataSet.class)
    public void testLoginWithemptyUserName(String userName, String password){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField,userName);
        loginPage.writeOnElement(loginPage.passwordField,password);
        loginPage.clickOnElement(loginPage.loginButton);
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator),loginPage.error_msg2);
    }
    @Test(dataProvider = "emptyPassword",dataProviderClass = DataSet.class)
    public void testLoginWithemptyPassword(String userName, String password){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField,userName);
        loginPage.writeOnElement(loginPage.passwordField,password);
        loginPage.clickOnElement(loginPage.loginButton);
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator),loginPage.error_msg3);
    }
}
