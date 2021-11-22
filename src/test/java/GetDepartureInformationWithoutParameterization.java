import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetDepartureInformationWithoutParameterization {

    @Test
    public void testDepartureInformationByValidatingStationNamesForRichmond() {

        given().
        when().
             get("https://api.bart.gov/api/etd.aspx?cmd=etd&key=MW9S-E7SL-26DU-VV8V&orig=RICH").
        then().
             assertThat().
             body("root.station[0].name", equalTo("Richmond"));
    }

    @Test
    public void testDepartureInformationByValidatingStationNamesForLakeMerritt() {

        String cmd = "etd";
        String key = "MW9S-E7SL-26DU-VV8V";

        given().
              pathParam("cmd", cmd).pathParam("key", key).
        when().
              get("https://api.bart.gov/api/etd.aspx?cmd={cmd}&key={key}&orig=LAKE").
        then().
              assertThat().
              body("root.station[0].name", equalTo("Lake Merritt"));
    }

    @Test
    public void testDepartureInformationByValidatingStationNamesForNorthConcord() {

        String cmd = "etd";
        String key = "MW9S-E7SL-26DU-VV8V";

        given().
                pathParam("cmd", cmd).pathParam("key", key).
                when().
                get("https://api.bart.gov/api/etd.aspx?cmd={cmd}&key={key}&orig=NCON").
                then().
                assertThat().
                body("root.station[0].name", equalTo("North Concord/Martinez"));
    }
}
