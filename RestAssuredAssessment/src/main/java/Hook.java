import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.baseURI;

public class Hook {
    @BeforeClass
    public void setup() {
        baseURI = "https://restful-booker.herokuapp.com";
    }
    @AfterClass
    public void Report(){


    }
}
