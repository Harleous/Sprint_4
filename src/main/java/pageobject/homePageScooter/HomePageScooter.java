package pageobject.homePageScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.Basepage.BasePage;

public class HomePageScooter extends BasePage {
    public HomePageScooter(WebDriver driver) {
        super(driver);

    }
    private final By upperOrderButton = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[@class = 'Button_Button__ra12g']");
     private final By middleOrderButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");



    public HomePageScooter upperOrderButtonClick(){
    driver.findElement(upperOrderButton).click();
    return this;
}
public HomePageScooter middleOrderButtonClick(){
    driver.findElement(middleOrderButton).click();
    return this;
}

}