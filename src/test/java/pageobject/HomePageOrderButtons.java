package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageOrderButtons {
    WebDriver driver;
    public HomePageOrderButtons (WebDriver driver){
        this.driver = driver;
    }
    private final By upperOrderButton = By.xpath(".//div[@class = Header_Nav__AGCXC]/button[@class = Button_Button__ra12g]");
    private final By middleOrderButton = By.xpath(".//div[@class = Home_FinishButton__1_cWm]/button[@class = Button_Button__ra12g Button_Middle__1CSJM]");

public void UpperOrderButtonClick(){
    driver.findElement(upperOrderButton).click();
}
public void middleOrderButtonClick(){
    driver.findElement(middleOrderButton).click();
}

}