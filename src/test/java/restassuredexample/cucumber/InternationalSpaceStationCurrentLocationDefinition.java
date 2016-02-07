package restassuredexample.cucumber;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class InternationalSpaceStationCurrentLocationDefinition {

    public InternationalSpaceStationCurrentLocationDefinition() {
        RestAssured.baseURI = InternationalSpaceStationCurrentLocationConfiguration.OPEN_NOTIFY_API_URI;
    }

    public void requestInternationalSpaceStationCurrentLocation() {
        Response response =
                given().
                        contentType("application/json").
                when().
                        get("/iss-now/").
                then().
                        statusCode(200).
                        extract().response();
    }

    public void validateInternationalSpaceStationCurrentLocationContents() {
        Response response =
                given().
                        contentType("application/json").
                when().
                        get("/iss-now/").
                then().
                        body(containsString("iss_position")).
                        body(containsString("message")).
                        body(containsString("timestamp")).
                        body(("message"), equalTo("success")).
                extract().response();
    }
}
