package testcases;

import org.testng.annotations.Test;
import page.CartPage;
import utilities.Driver_Setup;

public class TC03CartTest extends Driver_Setup {
    CartPage cartPage= new CartPage();
    @Test
    public void clickCheakOutButton() throws InterruptedException {
        getDriver().get(cartPage.cartPageUrl);
        cartPage.clickOnElement(cartPage.checkOutBtn);

    }
}
