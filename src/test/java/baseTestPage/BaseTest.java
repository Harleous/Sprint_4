package baseTestPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static Constants.Constant.Locators.BROWSER_IN_USE;
import static Constants.Constant.Urls.YA_SCOOTER_HOME_PAGE;


public class BaseTest {
    public WebDriver driver;
    public BaseTest() {
        this.driver = chooseDriver();
    }

    @Before
    public static  WebDriver  chooseDriver(){

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

        driver.get(YA_SCOOTER_HOME_PAGE);


        return driver;
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
