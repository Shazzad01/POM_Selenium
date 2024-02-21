package page;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver_Setup;

import java.util.List;

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
    public String getCurrentPageUrl(){
        return getDriver().getCurrentUrl();

    }
    public String getTitle(){
        return getDriver().getTitle();

    }
    public void sendTextOnElement(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public void hover(By locator){
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(getElement(locator)).build().perform();

    }
    public void shadowDomePopup(WebElement host,By element){
        SearchContext context = host.getShadowRoot();
        context.findElement(element).click();
    }

    public void selectItemByValue(WebElement element, String value){

        Select selectItems = new Select(element);
        selectItems.selectByValue(value);

    }
    public void selectItemByVisibleText(WebElement element,String value){
        Select selectItems = new Select(element);
        selectItems.selectByVisibleText(value);
    }
    public void selectItemByIndex(WebElement element, int index){
        Select selectItems = new Select(element);
        selectItems.selectByIndex(index);
    }

    public String selectedItemText(WebElement element){
        Select selectItems = new Select(element);
        return selectItems.getFirstSelectedOption().getText();

    }

    public boolean itemsSelectedStatus(List<WebElement> elements, String value){
        for (WebElement element: elements){
            if (element.getAttribute("value").equals(value)){
                return  element.isSelected();
            }
        }
        return false;

    }

    public void clickOnNthNumberButtton(List<WebElement> elements, int position){
        elements.get(position - 1).click();

    }

    public void listItem(List<WebElement> elements, String visibleText){
        for (WebElement element:elements){
            if(element.getText().equals(visibleText)){
                element.click();
                break;
            }
        }
    }

}
