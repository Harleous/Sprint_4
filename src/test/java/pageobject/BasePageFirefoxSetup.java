package pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public abstract class BasePageFirefoxSetup {
     WebDriver driver;
    public BasePageFirefoxSetup(WebDriver driver) {
        this.driver = driver;

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");

    }
}
