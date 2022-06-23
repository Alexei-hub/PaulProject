package API.Property;

import io.qameta.allure.*;
import io.qameta.allure.restassured.AllureRestAssured;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.FileInputStream;
import java.io.InputStream;

import static CommonMethods.Common.getCurrentData;
import static io.restassured.RestAssured.given;

public class FetchPropertyToursTest {

    private final String URL = "https://xanterraapi.zgtech.net/api/property/tours/grandcanyonlodges";

    @Test
    @Owner("Daniel")
    @Lead("Paul Fowler")
    @Description("API Fetch Property Tours")
    @Severity(SeverityLevel.NORMAL)
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://xanterraapi.zgtech.net/api/documentation", type = "Trello")
    public void fetchPropertyTours() throws Exception {
        InputStream inputStream = new FileInputStream("src/test/java/API/Property/FetchPropertyTours.json");
        String expected = Files.readFile(inputStream);
        expected = expected.replaceAll("06/21/2022", getCurrentData());

        String response = given()
                .filter(new AllureRestAssured())
                .when()
                .get(URL)
                .then().log().all()
                .extract().response().jsonPath().prettify();


        JSONAssert.assertEquals(expected, response, true);
    }
}