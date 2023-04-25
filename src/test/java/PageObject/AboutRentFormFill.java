package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.FormFieldsVariables.COMMENTS_FOR_COURIER;
import static Constants.Constant.FormFieldsVariables.RENTAL_DATE;

public class AboutRentFormFill {
    WebDriver driver;
    public AboutRentFormFill(WebDriver driver) {
        this.driver = driver;
    }

    private final By rentalDate = By.xpath(".//div[@class = 'react-datepicker__input-container']/input[@placeholder = '* Когда привезти самокат']");
    private final By rentalPeriod = By.className("Dropdown-placeholder");
    private final By rentalPeriodChoice = By.xpath(".//div[@class = 'Dropdown-menu']/div[@class = 'Dropdown-option']");
    private final By scooterColour = By.id("black");
    private final By commentsForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //private final By backButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Назад')]");

    private  final By orderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать')]");
//private final By buttonNo = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class= 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Нет')]");
    final By buttonYes = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class= 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да')]");

    //private static final By orderMadeBlock = By.className("Order_Modal__YZ-d3");
    private final By orderMade = By.className("Order_ModalHeader__3FDaJ");


public void AboutRentFormFillAndClickOrederButton(){
    driver.findElement(rentalDate).sendKeys(RENTAL_DATE, Keys.ENTER);
    driver.findElement(rentalPeriod).click();
    new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(rentalPeriodChoice));
    driver.findElement(rentalPeriodChoice).click();
    driver.findElement(scooterColour).click();
    driver.findElement(commentsForCourier).sendKeys(COMMENTS_FOR_COURIER);
driver.findElement(orderButton).click();
driver.findElement(buttonYes).click();
}

public static String orderMadeText;
public  String OrderMadeGetTex(){
    orderMadeText =  driver.findElement(orderMade).getText();
    return orderMadeText;
    }


}

