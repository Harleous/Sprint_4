package pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public abstract class BasePageChromeSetup {
     WebDriver driver;
    public BasePageChromeSetup(WebDriver driver){
        this.driver = driver;

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    driver.get("https://qa-scooter.praktikum-services.ru/");
}
}
