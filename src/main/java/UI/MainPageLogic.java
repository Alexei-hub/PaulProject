package UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {

    @Step("Click Check In - Check Out")
    public MainPageLogic clickCheckInOut() {
        selectCheck().shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }

    @Step("Click Flexible Dates")
    public MainPageLogic clickFlexibleBtn() {
        flexibleBtn().click();
        return this;
    }

    @Step("Click on month {month}")
    public MainPageLogic selectMonthInFlexibleDate(String month) {
        monthInFlexibleDate(month).click();
        return this;
    }

    @Step("Click Check Availability button")
    public SelectHotelLogic clickCheckAvailabilityBtn() {
        checkAvailabilityBtn().click();
        return page(SelectHotelLogic.class);
    }
}
