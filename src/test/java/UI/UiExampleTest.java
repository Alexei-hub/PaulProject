package UI;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UiExampleTest {

    private final String MONTH = "September 2022";

    @Test
    public void UiTest() {
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
