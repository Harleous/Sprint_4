package Constants;

import org.openqa.selenium.By;

public class Constant {
    public static class Locators {
        public static final String BROWSER_IN_USE = "Firefox";
        public static final By ACCORDION_ELEMENT = By.xpath(".//div[@class = 'accordion__item']");
        public static final By PANEL_ELEMENT_LOCATOR = By.xpath(".//div[@class = 'accordion__panel']");
    }

    public static class Urls {
        public static final String YA_SCOOTER_HOME_PAGE = "https://qa-scooter.praktikum-services.ru/";
        //public static final String ORDER_FORM_FOR_WHOM_SCOOTER_PAGE ="https://qa-scooter.praktikum-services.ru/order"; - пригодится для дальнейшего тестирования
    }
    public static class FormFieldsVariables {
        public static final String NAME_OF_SCOO_RENTER = "Павел";
        public static final String FAMILYNAME_OF_SCOO_RENTER = "Лапин";
        public static final String ADDRESS_OF_SCOO_RENTER = "Васильева 5";
        //- для доработки механизма поиска станций по начальным буквам
        //public static final String LETTERS_BEGINNING_OF_METRO_STATION = "Мол";
        public static final String TELEPHONE_NUMBER_OF_SCOO_RENTER = "12345678901";
        public static final String RENTAL_DATE = "01.01.2025";
        public final static String COMMENTS_FOR_COURIER = "Очень хочется покататься! :)";
        public final static String ORDER_MADE_TEXT = "Заказ оформлен";
    }
}
