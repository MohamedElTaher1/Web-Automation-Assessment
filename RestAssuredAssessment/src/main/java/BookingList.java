import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class BookingList extends Hook{
    @BeforeClass
    public void setup() {
        baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test
    public void testBookingListIsNotEmpty() {
        given()
                .when()
                .get("/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .body("size()", greaterThan(0))
                .log().all();
    }
}
