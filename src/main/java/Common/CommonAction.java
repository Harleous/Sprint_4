package Common;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static Common.Config.BROWSER;
import static Constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class
CommonAction {

    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER) {
            case "Firefox":
                System.setProperty("webdriver.Firefox.driver", "src/main/resources/Firefoxdriver.exe");
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                System.setProperty("webdriver.Chrome.driver", "src/main/resources/Chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect BROWSER name" + BROWSER);
        }

                driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;


    }
}