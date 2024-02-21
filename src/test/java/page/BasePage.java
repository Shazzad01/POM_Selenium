package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver_Setup;

public class BasePage extends Driver_Setup {
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);

    }
    public void clickOnElement(By locator){
        getElement(locator).click();

    }
    public void writeOnElement(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();

    }

}
