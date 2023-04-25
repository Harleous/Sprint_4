package firefoxtests;


import PageObject.HomePageScooter;
import PageObject.OrderFormForWhomScooterFill;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class OrderPositiveFlowTestFirefox {

    FirefoxOptions options = new FirefoxOptions();

    WebDriver driver = new FirefoxDriver(options);


@Before
public void setUp(){



    driver.get("https://qa-scooter.praktikum-services.ru");
    homePageScooter.coockieButtonClick();
}
     HomePageScooter homePageScooter = new HomePageScooter(driver);
     OrderFormForWhomScooterFill orderFormForWhomScooterFill = new OrderFormForWhomScooterFill(driver);
    @Test
    public void checkRedirectFromUpperButtonAndFillForm(){

        homePageScooter.upperOrderButtonClick();

        orderFormForWhomScooterFill.ForWhomScooterFillClickNext();

    }
    @Test
    public void checkRedirectFromLowerButtonAndFillForm(){
        homePageScooter.lowerOrderButtonClick();
        orderFormForWhomScooterFill.ForWhomScooterFillClickNext();
    }
    @After
    public void tearDown(){
        driver.quit();
}
}


