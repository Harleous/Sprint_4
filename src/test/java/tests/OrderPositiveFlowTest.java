package tests;


import PageObject.AboutRentFormFill;
import PageObject.ForWhomScooterFormFill;
import PageObject.HomePageScooter;
import baseTestPage.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static Constants.Constant.FormFieldsVariables.ORDER_MADE_TEXT;
import static PageObject.AboutRentFormFill.orderMadeText;


public class OrderPositiveFlowTest extends BaseTest {

    public OrderPositiveFlowTest(WebDriver driver) {
        super();
    }




     HomePageScooter homePageScooter = new HomePageScooter();
     ForWhomScooterFormFill forWhomScooterFormFill = new ForWhomScooterFormFill();
     AboutRentFormFill aboutRentFormFill =new AboutRentFormFill();


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

}


