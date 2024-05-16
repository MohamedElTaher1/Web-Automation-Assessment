import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class GenerateToken extends Hook{
    @BeforeClass
    public void setup() {
        baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test
    public void testAuthTokenIsGenerated() {
        given()
                .contentType(ContentType.JSON)
                .body("{ \"username\": \"admin\", \"password\": \"password123\" }")
                .when()
                .post("/auth")
                .then()
                .assertThat()
                .statusCode(200)
                .body("token", not(emptyString()))
                .log().all();
    }
}
