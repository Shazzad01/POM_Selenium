package page;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public String productPageTitle = "Swag Labs";
    public String productPageUrl = "https://www.saucedemo.com/inventory.html";
    public By addToCartBackPAck = By.id("add-to-cart-sauce-labs-backpack");
    public By addToCartBikeLight = By.id("add-to-cart-sauce-labs-bike-light");

    public By cartIcon = By.className("shopping_cart_link");

}
