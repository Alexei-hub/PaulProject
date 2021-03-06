package UI;

import SetUp.SetUpBrowser;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class UiExampleTest extends SetUpBrowser {

    private final String URL = "https://glaciernationalparklodgesapiuat.xanterra.net/booking/lodging";
    private final String MONTH = "September 2022";

    @Test
    @Owner("Daniel")
    @Lead("Paul Fowler")
    @Description("Test check correct page after choosing Flexible Dates")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In - Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void UiTest() {
        openPage(URL);
        new MainPageLogic()
                .clickCheckInOut()
                .clickFlexibleBtn()
                .selectMonthInFlexibleDate(MONTH)
                .clickCheckAvailabilityBtn()
                .checkCorrectMonthPage(MONTH);
    }

    @AfterTest
    public void after() {
        closeWebDriver();
    }
}
