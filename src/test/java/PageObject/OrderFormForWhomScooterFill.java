package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.FormFieldsVariables.*;


public class OrderFormForWhomScooterFill  {
WebDriver driver;
    public OrderFormForWhomScooterFill (WebDriver driver) {
        this.driver = driver;
    }


    private final By orderFormNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    private final By orderFormFamilyNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class ='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    private final By orderFormAddressField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    private final By orderFormMetroStationField = By.xpath(".//div[@class = 'select-search']");
    private final By orderFormMetroStationFieldInput = By.className("select-search__input");
    private final By orderFormMetroStationFieldValue = By.xpath(".//div[@class = 'select-search has-focus']//li[@data-value='51']");

    private final By orderFormTelephoneNumberField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By orderFormForWhomeScooterNextButton = By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");



    public  void ForWhomScooterFillClickNext () {
    driver.findElement(orderFormNameField).click();
        driver.findElement(orderFormNameField).sendKeys(NAME_OF_SCOO_RENTER);

        driver.findElement(orderFormFamilyNameField).click();
        driver.findElement(orderFormFamilyNameField).sendKeys(FAMILYNAME_OF_SCOO_RENTER);

        driver.findElement(orderFormAddressField).click();
        driver.findElement(orderFormAddressField).sendKeys(ADDRESS_OF_SCOO_RENTER);

        //driver.findElement(orderFormMetroStationField).click();
        //driver.findElement(orderFormMetroStationFieldInput).sendKeys(LETTERS_BEGINNING_OF_METRO_STATION);
        //findMetroStatinByChars.chooseMetroStation();
        driver.findElement(orderFormMetroStationField).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(orderFormMetroStationFieldInput)));
        driver.findElement(orderFormMetroStationFieldInput).sendKeys("Молодёжная");
        driver.findElement(orderFormMetroStationFieldValue).click();


        driver.findElement(orderFormTelephoneNumberField).click();
    driver.findElement(orderFormTelephoneNumberField).sendKeys(TELEPHONE_NUMBER_OF_SCOO_RENTER);

    driver.findElement(orderFormForWhomeScooterNextButton).click();
    }
}



