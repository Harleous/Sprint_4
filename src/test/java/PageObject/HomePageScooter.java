package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageScooter {
    WebDriver driver;

    private By upperOrderButton = By.xpath("//div[(@class = 'Header_Nav__AGCXC')]/button[@class = 'Button_Button__ra12g']");
    private By lowerOrderButton = By.xpath("//div[@class = 'Home_FinishButton']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By coockieButton = By.className("App_CookieButton__3cvqF");

    public HomePageScooter(WebDriver   driver) {
        this.driver = driver;
    }

    public void coockieButtonClick(){
        driver.findElement(coockieButton).click();

    }
    public void upperOrderButtonClick(){

        driver.findElement(upperOrderButton).click();
    }
    public void lowerOrderButtonClick(){

        driver.findElement(lowerOrderButton).click();
    }
}
