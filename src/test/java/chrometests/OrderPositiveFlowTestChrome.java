package chrometests;

import PageObject.HomePageScooter;
import PageObject.OrderFormForWhomScooterFill;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderPositiveFlowTestChrome {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);

        driver.get("https://qa-scooter.praktikum-services.ru");



    }
    protected HomePageScooter homePageScooter = new HomePageScooter(driver);
    protected OrderFormForWhomScooterFill orderFormForWhomScooterFill = new OrderFormForWhomScooterFill(driver);

    @Test
    public void checkRedirectFromUpperButtonAndFillForm(){

        homePageScooter.upperOrderButtonClick();

        orderFormForWhomScooterFill.ForWhomScooterFillClickNext();
        System.out.println("Положительный результат Все работает!");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
