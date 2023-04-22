package pageobject.OrderFormForWhomScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.Basepage.BasePage;

import java.util.List;


public class OrderFormForWhomScooterFill extends BasePage {

    public OrderFormForWhomScooterFill (WebDriver driver) {
        super(driver);
    }


    private final By orderFormNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    private final By orderFormFamilyNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class ='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    private final By orderFormAddressField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    private final By orderFormMetroStationField = By.xpath();
    private final By getOrderFormMetroStationFieldInput = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");

    private final By orderFormTelephoneNumberField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'select-search__value']/input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By orderFormForWhomeScooterNextButton = By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");




    public void ForWhomScooterFillClickNext () {
    orderFormNameField.click();
    orderFormNameField.sendKeys("Павел");

    orderFormFamilyNameField.click();
    orderFormFamilyNameField.sendKeys("Лапин");

    orderFormAddressField.click();
    orderFormAddressField.sendKeys("Василькова 6");

    orderFormMetroStationField.click();
    getOrderFormMetroStationFieldInput.sendKeys("Мол");

   List<WebElement> metroStations = driver.findElements(By.xpath(".//div[@class = Order_Filled__3GNlS]/div[@class = select-search has-focus]/div[@class = select-search__value]//li[@Class = select-search__row]"));
for (WebElement chosenMetrostation : metroStations){
    if (chosenMetrostation.getText() == "Молодёжная"){
        chosenMetrostation.click();
        break;
       }
    orderFormTelephoneNumberField.click();
    orderFormTelephoneNumberField.sendKeys("12345678910");

    orderFormForWhomeScooterNextButton.click();
    }
}


}
