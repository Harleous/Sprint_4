package baseTestPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static Constants.Constant.Locators.BROWSER_IN_USE;


public class BaseTest {
public  WebDriver driver;



    @Before
    public  void WebDriver (){

        switch (BROWSER_IN_USE){
            case "Firefox" :
                FirefoxOptions options = new FirefoxOptions();

                driver = new FirefoxDriver(options);
                break;
            case "Chrome" :
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            /*default:
                Assert.fail("Неправильное имя  браузера: " + BROWSER_IN_USE );*/


        }




    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
