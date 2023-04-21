package firefoxtests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobject.BasePageFirefoxSetup;
import pageobject.HomePageOrderButtons;
import pageobject.OrderFormForWhomScooterFill;

public class OrderPositiveFlow extends BasePageFirefoxSetup {
    public OrderPositiveFlow(WebDriver driver) {
        super(driver);
    }
    OrderFormForWhomScooterFill orderFormForWhomScooterFill = new OrderFormForWhomScooterFill();
    @Test
    public void OrderFormForWhomScooterNextButtonClickOpensFormAbout(){

    }

}
