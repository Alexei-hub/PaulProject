package UI;

import com.codeborne.selenide.Condition;

public class SelectHotelLogic extends SelectHotelElements {

    public SelectHotelLogic checkCorrectMonthPage(String month) {
        monthSelected().shouldHave(Condition.text(month));
        return this;
    }
}
