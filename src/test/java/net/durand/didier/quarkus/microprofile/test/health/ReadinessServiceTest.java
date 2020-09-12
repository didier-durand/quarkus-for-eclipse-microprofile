package net.durand.didier.quarkus.microprofile.test.health;

import io.quarkus.test.junit.QuarkusTest;
import net.durand.didier.quarkus.microprofile.health.ReadinessService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class ReadinessServiceTest {

    @Test
    public void testReadinessEndpoint() {
        assertNotNull(given()	
          .when().get("/health/ready")
          .then()
             .statusCode(200)
             .body(containsString(ReadinessService.RESPONSE)));
    }

}