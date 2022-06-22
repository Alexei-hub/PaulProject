package UI;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UiFailExampleTest {

    private final String MONTH = "Septemer 2022";

    @Test
    public void UiFailTest() {
//        Configuration.startMaximized = true;
        Configuration.timeout = 160000;
        Configuration.pageLoadTimeout = 160000;
        open("https://glaciernationalparklodgesapiuat.xanterra.net/booking/lodging");
        new MainPageLogic()
                .clickCheckInOut()
                .clickFlexibleBtn()
                .selectMonthInFlexibleDate(MONTH)
                .clickCheckAvailabilityBtn()
                .checkCorrectMonthPage(MONTH);
    }
}
