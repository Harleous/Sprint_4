package baseTest;

import Common.CommonAction;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pageobject.Basepage.BasePage;
import pageobject.OrderFormForWhomScooter.OrderFormForWhomScooterFill;
import pageobject.homePageScooter.HomePageScooter;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePageScooter homePageScooter = new HomePageScooter(driver);
    protected OrderFormForWhomScooterFill orderFormForWhomScooterFill = new OrderFormForWhomScooterFill(driver);

    @After
    public void clearCoockiesAndQuit(){
        driver.manage().deleteAllCookies();
        driver.quit();

    }
}
