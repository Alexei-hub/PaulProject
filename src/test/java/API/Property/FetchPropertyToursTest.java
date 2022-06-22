package API.Property;

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
    public void fetchPropertyTours() throws Exception {
        InputStream inputStream = new FileInputStream("src/test/java/API/Property/FetchPropertyTours.json");
        String expected = Files.readFile(inputStream);
        expected = expected.replaceAll("06/21/2022", getCurrentData());

        String response = given()
                .when()
                .get(URL)
                .then().log().all()
                .extract().response().jsonPath().prettify();


        JSONAssert.assertEquals(expected, response, true);
    }
}