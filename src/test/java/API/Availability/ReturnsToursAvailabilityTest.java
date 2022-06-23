package API.Availability;

import io.qameta.allure.*;
import io.qameta.allure.restassured.AllureRestAssured;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.FileInputStream;
import java.io.InputStream;

import static CommonMethods.Common.getCurrentData;
import static io.restassured.RestAssured.given;

public class ReturnsToursAvailabilityTest {

    private final String URL = "https://xanterraapi.zgtech.net/api/availability/hotels/grandcanyonlodges?date=tomorrow&limit=1&rate_code=ALL&nights=1";

    @Test
    @Owner("Daniel")
    @Lead("Paul Fowler")
    @Description("API Returns Tours Availability")
    @Severity(SeverityLevel.NORMAL)
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://xanterraapi.zgtech.net/api/documentation", type = "Trello")
    public void returnsToursAvailability() throws Exception {
        InputStream inputStream = new FileInputStream("src/test/java/API/Availability/ReturnsToursAvailability.json");
        String expected = Files.readFile(inputStream);
        expected = expected.replaceAll("06/21/2022", getCurrentData());


        String response = given()
                .filter(new AllureRestAssured())
                .when()
                .get(URL)
                .then()
                .extract().response().jsonPath().prettify();

        JSONAssert.assertEquals(expected, response, true);
    }
}
