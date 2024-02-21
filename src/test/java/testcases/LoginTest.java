package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.ProductPage;
import utilities.Driver_Setup;

public class LoginTest extends Driver_Setup {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Test
    public void testLoginWithValidCredentials(){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.userNameField, "standard_user");
        loginPage.writeOnElement(loginPage.passwordField, "secret_sauce");
        loginPage.clickOnElement(loginPage.loginButton);
        Assert.assertEquals(getDriver().getCurrentUrl(), productPage.productPageUrl);
    }
}
