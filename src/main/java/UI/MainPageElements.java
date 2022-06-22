package UI;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    SelenideElement selectCheck() {
        return $(By.xpath("//div[contains(text(), 'Check In - Check Out')]/.."));
    }

    SelenideElement flexibleBtn() {
        return $(By.xpath("//div[contains(text(), ' Flexible Dates ')]"));
    }

    SelenideElement monthInFlexibleDate(String month) {
        return $(By.xpath("//button[contains(text(), '" + month + "')]"));
    }

    SelenideElement checkAvailabilityBtn() {
        return $(By.xpath("//button[contains(@class, 'check-avail__button')]"));
    }
}
