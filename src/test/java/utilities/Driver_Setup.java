package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.time.Duration;
import java.util.Locale;

public class Driver_Setup {
    private static String browser_name = System.getProperty("browser","edge");
    private static final ThreadLocal<WebDriver>LOCAL_Driver= new ThreadLocal<>();

    public static void set_Driver(WebDriver driver){
        Driver_Setup.LOCAL_Driver.set(driver);

    }

    public static WebDriver getDriver(){
        return LOCAL_Driver.get();

    }


    public static WebDriver get_browser(String browser_name){
        switch(browser_name.toLowerCase()){
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new RuntimeException("Browser not Found! using the given browser name:" +browser_name);
        }
    }
    @BeforeSuite
    public static synchronized void setBrowser(){
        WebDriver driver = get_browser(browser_name);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        set_Driver(driver);
    }
    @AfterSuite
    public static synchronized void quitBrowser(){
        getDriver().quit();
    }


}
