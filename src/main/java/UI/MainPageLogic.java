package UI;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElements {

    @Step
    public MainPageLogic clickCheckInOut() {
        selectCheck().click();
        return this;
    }

    public MainPageLogic clickFlexibleBtn() {
        flexibleBtn().click();
        return this;
    }

    public MainPageLogic selectMonthInFlexibleDate(String month) {
        monthInFlexibleDate(month).click();
        return this;
    }

    public SelectHotelLogic clickCheckAvailabilityBtn() {
        checkAvailabilityBtn().click();
        return page(SelectHotelLogic.class);
    }
}
