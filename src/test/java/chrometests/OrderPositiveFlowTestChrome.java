package chrometests;

import PageObject.AboutRentFormFill;
import PageObject.ForWhomScooterFormFill;
import PageObject.HomePageScooter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static Constants.Constant.FormFieldsVariables.ORDER_MADE_TEXT;
import static PageObject.AboutRentFormFill.orderMadeText;

public class OrderPositiveFlowTestChrome {

    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    @Before
    public void setUp(){

        driver.get("https://qa-scooter.praktikum-services.ru");
        homePageScooter.coockieButtonClick();
    }
    HomePageScooter homePageScooter = new HomePageScooter(driver);
    ForWhomScooterFormFill forWhomScooterFormFill = new ForWhomScooterFormFill(driver);
    AboutRentFormFill aboutRentFormFill =new AboutRentFormFill(driver);

    @Test
    public void checkRedirectFromUpperButtonAndFillForm(){

        homePageScooter.upperOrderButtonClick();

        forWhomScooterFormFill.ForWhomScooterFillClickNext();
        aboutRentFormFill.AboutRentFormFillAndClickOrederButton();
        aboutRentFormFill.OrderMadeGetTex();
        Assert.assertTrue(orderMadeText.contains(ORDER_MADE_TEXT));


    }

    @Test
    public void checkRedirectFromLowerButtonAndFillForm(){
        homePageScooter.lowerOrderButtonClick();
        forWhomScooterFormFill.ForWhomScooterFillClickNext();
        aboutRentFormFill.AboutRentFormFillAndClickOrederButton();
        aboutRentFormFill.OrderMadeGetTex();
        Assert.assertTrue(orderMadeText.contains(ORDER_MADE_TEXT));

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}


