package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.FormFieldsVariables.*;


public class ForWhomScooterFormFill extends BasePage {
        public WebDriver driver;
    public ForWhomScooterFormFill(WebDriver driver) {
        super(driver);
    }


    //Локатор поля "Имя" в форме "Для кого самокат"
    private final By orderFormNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    //Локатор поля "Фамлия" в форме "Для кого самокат"
    private final By orderFormFamilyNameField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class ='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    //Локатор поля "Адрес" в форме "Для кого самокат"
    private final By orderFormAddressField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    //Локатор поля "Станция метро" в форме "Для кого самокат"
    private final By orderFormMetroStationField = By.xpath(".//div[@class = 'select-search']");
    //Локатор поля ввода "Станции метро" в форме "Для кого самокат"
    private final By orderFormMetroStationFieldInput = By.className("select-search__input");
    //Локатор элемента "Станция метро" из выпадающего списка
    private final By orderFormMetroStationFieldValue = By.xpath(".//div[@class = 'select-search has-focus']//li[@data-value='51']");

    //Локатор поля "Телефон" в форме "Для кого самокат"
    private final By orderFormTelephoneNumberField = By.xpath(".//div[@class = 'Order_Form__17u6u']/div[@class = 'Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    //Локатор кнопки "Далее" в форме "Для кого самокат"
    private final By orderFormForWhomeScooterNextButton = By.xpath(".//div[@class = 'Order_NextButton__1_rCA']/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");




    public  void ForWhomScooterFillClickNext () {
        //вводим имя
    driver.findElement(orderFormNameField).click();
        driver.findElement(orderFormNameField).sendKeys(NAME_OF_SCOO_RENTER);
        //вводим фамилию
        driver.findElement(orderFormFamilyNameField).click();
        driver.findElement(orderFormFamilyNameField).sendKeys(FAMILYNAME_OF_SCOO_RENTER);
        //вводим адрес
        driver.findElement(orderFormAddressField).click();
        driver.findElement(orderFormAddressField).sendKeys(ADDRESS_OF_SCOO_RENTER);
        //выбираем станцию метро
        driver.findElement(orderFormMetroStationField).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(orderFormMetroStationFieldInput)));
        driver.findElement(orderFormMetroStationFieldInput).sendKeys("Молодёжная");
        driver.findElement(orderFormMetroStationFieldValue).click();

        //вводим номер телефона
        driver.findElement(orderFormTelephoneNumberField).click();
        driver.findElement(orderFormTelephoneNumberField).sendKeys(TELEPHONE_NUMBER_OF_SCOO_RENTER);
     //Нажимаем кнопку "Далее"
    driver.findElement(orderFormForWhomeScooterNextButton).click();
    }
}



