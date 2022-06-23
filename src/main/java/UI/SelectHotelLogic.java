package UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class SelectHotelLogic extends SelectHotelElements {

    @Step("Check month in tittle {month}")
    public SelectHotelLogic checkCorrectMonthPage(String month) {
        monthSelected().shouldHave(Condition.text(month));
        return this;
    }
}
