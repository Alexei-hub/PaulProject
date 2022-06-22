package UI;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelectHotelElements {

    SelenideElement monthSelected() {
        return $(By.xpath("//span[@class='ant-divider-inner-text']"));
    }
}
