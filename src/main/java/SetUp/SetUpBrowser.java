package SetUp;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class SetUpBrowser {

    @Step("Open page {url}")
    public void openPage(String url) {
        Configuration.timeout = 200000;
        Configuration.startMaximized = true;
        open(url);
    }
}
