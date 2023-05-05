package baseTestPage;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static Constants.Constant.Locators.BROWSER_IN_USE;


public class BaseTest {




    public static WebDriver chooseDriver(){
        WebDriver driver = null;
        switch (BROWSER_IN_USE){
            case "Firefox" :
                FirefoxOptions options = new FirefoxOptions();

                driver = new FirefoxDriver(options);
                break;
            case "Chrome" :
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                Assert.fail("Неправильное имя  браузера: " + BROWSER_IN_USE );


        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().deleteAllCookies();
        return driver;


    }

}