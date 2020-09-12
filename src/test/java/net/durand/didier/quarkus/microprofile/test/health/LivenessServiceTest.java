package net.durand.didier.quarkus.microprofile.test.health;

import io.quarkus.test.junit.QuarkusTest;
import net.durand.didier.quarkus.microprofile.health.LivenessService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class LivenessServiceTest {

    @Test
    public void testLivenessEndpoint() {
        assertNotNull(given()	
          .when().get("/health/live")
          .then()
             .statusCode(200)
             .body(containsString(LivenessService.RESPONSE)));
    }

}