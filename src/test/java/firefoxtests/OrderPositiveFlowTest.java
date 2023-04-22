package firefoxtests;

import baseTest.BaseTest;
import org.junit.Test;

import static Constants.Constant.Urls.YA_SCOOTER_HOME_PAGE;


public class OrderPositiveFlowTest extends BaseTest {

    public OrderPositiveFlowTest() {
    }

    @Test
    public void checkRedirectFromUpperButton(){
    basePage.openWebPage(YA_SCOOTER_HOME_PAGE);
        homePageScooter.upperOrderButtonClick();

        orderFormForWhomScooterFill.ForWhomScooterFillClickNext();
        System.out.println("ОХРЕНЕТЬ! КАЖЕТСЯ, ВСЕ ПОЛУЧИЛОСЬ!");
    }
}


