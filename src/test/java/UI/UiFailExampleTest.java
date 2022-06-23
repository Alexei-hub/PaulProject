package UI;

import SetUp.SetUpBrowser;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class UiFailExampleTest extends SetUpBrowser {

    private final String URL = "https://glaciernationalparklodgesapiuat.xanterra.net/booking/lodging";
    private final String MONTH = "Septemer 2022";

    @Test
    @Owner("Daniel")
    @Lead("Paul Fowler")
    @Description("Test check correct page after choosing Flexible Dates")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In - Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-2")
    @TmsLink("tc-2")
    @Link(name = "requirements", url="https://www.somerequire.com",type = "Trello")
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
