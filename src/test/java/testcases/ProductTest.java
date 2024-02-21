package testcases;

import org.testng.annotations.Test;
import page.ProductPage;
import utilities.Driver_Setup;

public class ProductTest extends Driver_Setup {

    ProductPage productPage = new ProductPage();
    @Test
    public void testFakeDataCreate(){
        System.out.println(productPage.emailGenerate());
        System.out.println(productPage.firstNameGenerate());
        System.out.println(productPage.lastNameGenerate());

    }
}
