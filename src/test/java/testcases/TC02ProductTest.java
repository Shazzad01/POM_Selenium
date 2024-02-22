package testcases;

import org.testng.annotations.Test;
import page.LoginPage;
import page.ProductPage;
import utilities.DataSet;
import utilities.Driver_Setup;

public class TC02ProductTest extends Driver_Setup {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Test(dataProvider = "validCredentials",dataProviderClass = DataSet.class)
    public void addToCartProduct(String userName, String password) throws InterruptedException {
        getDriver().get(productPage.productPageUrl);
//        loginPage.writeOnElement(loginPage.userNameField,userName );
//        loginPage.writeOnElement(loginPage.passwordField,password );
//        loginPage.clickOnElement(loginPage.loginButton);
        productPage.clickOnElement(productPage.addToCartBackPAck);
        productPage.clickOnElement(productPage.addToCartBikeLight);
        productPage.clickOnElement(productPage.cartIcon);

    }
//    @Test
//    public void testFakeDataCreate(){
//        System.out.println(productPage.emailGenerate());
//        System.out.println(productPage.firstNameGenerate());
//        System.out.println(productPage.lastNameGenerate());
//
//    }
}
