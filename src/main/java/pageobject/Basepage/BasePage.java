package pageobject.Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public  class BasePage {
     protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openWebPage (String url){
        driver.get(url);
    }
    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}

        /*WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");*/



