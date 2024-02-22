package page;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{
    public String checkOutPageUrl="https://www.saucedemo.com/checkout-step-one.html";
    public By checkOut_firstName = By.id("first-name");
    public By checkOut_lastName = By.id("last-name");
    public By checkOut_postalCode = By.id("postal-code");
    public By checkOut_btn = By.id("continue");
    public By finish_btn = By.id("finish");

}
