package tests;


import PageObject.AboutRentFormFill;
import PageObject.ForWhomScooterFormFill;
import PageObject.HomePageScooter;
import baseTestPage.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static Constants.Constant.FormFieldsVariables.ORDER_MADE_TEXT;
import static Constants.Constant.Urls.YA_SCOOTER_HOME_PAGE;
import static PageObject.AboutRentFormFill.orderMadeText;


public class OrderPositiveFlowTest  {
    WebDriver driver = BaseTest.chooseDriver();

     HomePageScooter homePageScooter = new HomePageScooter(driver);
     ForWhomScooterFormFill forWhomScooterFormFill = new ForWhomScooterFormFill(driver);
     AboutRentFormFill aboutRentFormFill =new AboutRentFormFill(driver);


    @Test

    public void checkRedirectFromUpperButtonAndFillForm(){

        driver.get(YA_SCOOTER_HOME_PAGE);
        homePageScooter.cookieButtonClick();
        homePageScooter.upperOrderButtonClick();

        forWhomScooterFormFill.ForWhomScooterFillClickNext();
        aboutRentFormFill.AboutRentFormFillAndClickOrderButton();
        aboutRentFormFill.OrderMadeGetTex();
        Assert.assertTrue(orderMadeText.contains(ORDER_MADE_TEXT));


    }

    @Test
    public void checkRedirectFromLowerButtonAndFillForm(){
        driver.get(YA_SCOOTER_HOME_PAGE);
        homePageScooter.cookieButtonClick();
        homePageScooter.lowerOrderButtonClick();
        forWhomScooterFormFill.ForWhomScooterFillClickNext();
        aboutRentFormFill.AboutRentFormFillAndClickOrderButton();
        aboutRentFormFill.OrderMadeGetTex();
        Assert.assertTrue(orderMadeText.contains(ORDER_MADE_TEXT));

    }
   @After
    public void tearDown(){
        driver.quit();
    }
}


