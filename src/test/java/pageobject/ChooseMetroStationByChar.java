package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseMetroStationByChar {
    WebDriver driver;

    public ChooseMetroStationByChar(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement> metroStations = driver.findElements(By.xpath(".//div[@class = Order_Filled__3GNlS]/div[@class = select-search has-focus]/div[@class = select-search__value]//li[@Class = select-search__row]"));


public void ChooseMetroStationByChar(){
     for (WebElement chosenMetrostation : metroStations)

    {
        if (chosenMetrostation.getText() == "Молодёжная") {
            chosenMetrostation.click();
            break;
        }
    }
}

}

