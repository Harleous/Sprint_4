package PageObject;

import baseTestPage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageScooter extends BasePage {
    public HomePageScooter(WebDriver driver) {

        super(driver);
    }

    //Верхняя кнопка "Заказать"
    private final By upperOrderButton = By.xpath(".//div[(@class = 'Header_Nav__AGCXC')]/button[@class = 'Button_Button__ra12g']");
    //Нижняя кнопка "Заказать"
    private final By lowerOrderButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Кнопка закрывания куки "Да все привыкли"
    private static final By cookieButton = By.xpath(".//button[text()='да все привыкли']");    //By.className("App_CookieButton__3cvqF");





    /*public HomePageScooter(WebDriver   driver) {
        this.driver = driver;
    }*/

    public void cookieButtonClick(){
        driver.findElement(cookieButton).click();

    }
    public void upperOrderButtonClick(){

        driver.findElement(upperOrderButton).click();
    }
    public void lowerOrderButtonClick(){

        driver.findElement(lowerOrderButton).click();
    }
}
