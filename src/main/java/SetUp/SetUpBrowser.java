package SetUp;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class SetUpBrowser {

    @Step("Open page {url}")
    public void openPage(String url) {
        Configuration.startMaximized = true;
        Configuration.pageLoadTimeout = 20000;
        open(url);
    }
}
