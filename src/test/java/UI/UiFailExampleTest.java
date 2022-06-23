package UI;

import SetUp.SetUpBrowser;
import org.testng.annotations.Test;

public class UiFailExampleTest extends SetUpBrowser {

    private final String URL = "https://glaciernationalparklodgesapiuat.xanterra.net/booking/lodging";
    private final String MONTH = "Septemer 2022";

    @Test
    public void UiFailTest() {
        openPage(URL);
        new MainPageLogic()
                .clickCheckInOut()
                .clickFlexibleBtn()
                .selectMonthInFlexibleDate(MONTH)
                .clickCheckAvailabilityBtn()
                .checkCorrectMonthPage(MONTH);
    }
}
