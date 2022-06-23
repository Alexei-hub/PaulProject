package UI;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {

    @Step("Click Check In - Check Out")
    public MainPageLogic clickCheckInOut() {
        selectCheck().click();
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
