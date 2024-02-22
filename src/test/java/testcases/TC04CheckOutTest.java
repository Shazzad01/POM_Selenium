package testcases;

import org.testng.annotations.Test;
import page.CheckOutPage;
import utilities.Driver_Setup;

public class TC04CheckOutTest extends Driver_Setup {
    CheckOutPage checkOutPage = new CheckOutPage();
    @Test
    public void clickContinueButton(){
        getDriver().get(checkOutPage.checkOutPageUrl);
        checkOutPage.writeOnElement(checkOutPage.checkOut_firstName,checkOutPage.firstNameGenerate());
        checkOutPage.writeOnElement(checkOutPage.checkOut_lastName,checkOutPage.lastNameGenerate());
        checkOutPage.writeOnElement(checkOutPage.checkOut_postalCode,checkOutPage.zipCodeGenerate());
        checkOutPage.clickOnElement(checkOutPage.checkOut_btn);
        checkOutPage.clickOnElement(checkOutPage.finish_btn);

    }
}
