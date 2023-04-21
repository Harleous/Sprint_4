package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class OrderFormForWhomScooterFill {

    WebDriver driver;
    public OrderFormForWhomScooterFill() {
        this.driver = driver;
    }
    List<WebElement> orderFormFields = driver.findElements(By.xpath(".//div[@class = Order_Form__17u6u]/div[@class = Input_InputContainer__3NykH]"));
    private final WebElement orderFormNameField = driver.findElement((By) orderFormFields.get(1));
    private final WebElement orderFormFamilyNameField = driver.findElement((By) orderFormFields.get(2));
    private final WebElement orderFormAddressField = driver.findElement((By) orderFormFields.get(3));
    private final WebElement orderFormMetroStationField = driver.findElement(By.cssSelector(".Order_Form__17u6u > div:nth-child(4)"));
    private final WebElement getOrderFormMetroStationFieldInput = driver.findElement(By.xpath(".//div[@class = select-search__value]/input[@class = select-search__input]"));

    private final WebElement orderFormTelephoneNumberField = driver.findElement((By) orderFormFields.get(4));
    private final WebElement orderFormForWhomeScooterNextButton = driver.findElement(By.xpath(".//div[@class = Order_NextButton__1_rCA]/button[@class = Button_Button__ra12g Button_Middle__1CSJM]"));





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
