package PageObject;

import baseTestPage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.FormFieldsVariables.COMMENTS_FOR_COURIER;
import static Constants.Constant.FormFieldsVariables.RENTAL_DATE;

public class AboutRentFormFill extends BasePage {
    public AboutRentFormFill(WebDriver driver) {

        super(driver);
    }

    //Локатор поля "Когда привезти самокат" в форме "Про аренду"
    private final By rentalDate = By.xpath(".//div[@class = 'react-datepicker__input-container']/input[@placeholder = '* Когда привезти самокат']");
    //Локатор поля "Срок аренды" в форме "Про аренду"
    private final By rentalPeriod = By.className("Dropdown-placeholder");
    //Локатор элемента выпадающего списка поля "Срок аренды" в форме "Про аренду"
    private final By rentalPeriodChoice = By.xpath(".//div[@class = 'Dropdown-menu']/div[@class = 'Dropdown-option']");
    //Локатор поля "Цвет самоката" в форме "Про аренду"
    private final By scooterColour = By.id("black");
    //Локатор поля "Комментарий для курьера" в форме "Про аренду"
    private final By commentsForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //private final By backButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Назад')]");

    //Локатор кнопки "Заказать" в форме "Про аренду"
    private  final By orderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать')]");

              //private final By buttonN = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class= 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Нет')]"); - Локатор для теста кнопки "Нет"

    //Локатор кнопки "Да" во всплывающем окне "Хотите оформить заказ?"
    final By buttonYes = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[(@class= 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да')]");

    //Локатор всплывающего окна "Заказ оформлен"
    private final By orderMade = By.className("Order_ModalHeader__3FDaJ");




 public void AboutRentFormFillAndClickOrderButton(){
    //Вводим дату аренды
    driver.findElement(rentalDate).sendKeys(RENTAL_DATE, Keys.ENTER);
    //Выбираем срок аренды
    driver.findElement(rentalPeriod).click();
    new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(rentalPeriodChoice));
    driver.findElement(rentalPeriodChoice).click();
    //Выбираем цвет самоката
    driver.findElement(scooterColour).click();
    //Вводим комментарии курьеру
    driver.findElement(commentsForCourier).sendKeys(COMMENTS_FOR_COURIER);
    //Нажимаем кнопку "Заказать"
driver.findElement(orderButton).click();
//Нажимаем кнопку "Да"
driver.findElement(buttonYes).click();
}

//Получаем текст всплывающего окна "Заказ оформлен"
public static String orderMadeText;
public  String OrderMadeGetTex(){
    orderMadeText =  driver.findElement(orderMade).getText();
    return orderMadeText;
    }


}

