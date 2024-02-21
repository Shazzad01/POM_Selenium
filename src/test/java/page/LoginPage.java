package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String loginPageUrl = "https://www.saucedemo.com/";
    public By userNameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By loginButton = By.id("login-button");
    public By userName = By.id("loginUserName");
    public By password = By.className("loginPassword");
    public String getUserName(){
        return getElementText(userName);
    }
    public String getPassword(){
        return getElementText(password);
    }

}
