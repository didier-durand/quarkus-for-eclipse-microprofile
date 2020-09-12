package net.durand.didier.quarkus.microprofile.test;

import io.quarkus.test.junit.QuarkusTest;
import net.durand.didier.quarkus.microprofile.HelloWorld;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloEndpoint() {
        assertNotNull(given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is(HelloWorld.BODY)));
        
    }

}