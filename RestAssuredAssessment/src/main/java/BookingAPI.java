import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class BookingAPI extends Hook {


    @Test
    public void testBookingIsAddedSuccessfully() {

        String bookingData = "{ " +
                "\"firstname\" : \"Jim\", " +
                "\"lastname\" : \"Brown\", " +
                "\"totalprice\" : 111, " +
                "\"depositpaid\" : true, " +
                "\"bookingdates\" : { " +
                "    \"checkin\" : \"2018-01-01\", " +
                "    \"checkout\" : \"2019-01-01\" " +
                "}, " +
                "\"additionalneeds\" : \"Breakfast\" " +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(bookingData)
                .when()
                .post("/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .body("booking.firstname", equalTo("Jim"))
                .body("booking.lastname", equalTo("Brown"))
                .body("booking.totalprice", equalTo(111))
                .body("booking.depositpaid", equalTo(true))
                .body("booking.bookingdates.checkin", equalTo("2018-01-01"))
                .body("booking.bookingdates.checkout", equalTo("2019-01-01"))
                .body("booking.additionalneeds", equalTo("Breakfast"))
                .log().all();
    }
}
