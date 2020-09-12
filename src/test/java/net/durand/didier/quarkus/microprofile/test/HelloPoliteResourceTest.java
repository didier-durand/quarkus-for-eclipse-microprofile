package net.durand.didier.quarkus.microprofile.test;

import io.quarkus.test.junit.QuarkusTest;
import net.durand.didier.quarkus.microprofile.HelloService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloPoliteResourceTest {

    @Test
    public void testHelloPoliteEndpoint() {
    	String name = "Baeldung";
        assertNotNull(given()
          .when().get("/hello/polite" + "/" + name)
          .then()
             .statusCode(200)
             .body(is(HelloService.GREETINGS + name)));
        
    }
    
    @Test
    public void testHelloPoliteEndpointNobody() {
        assertNotNull(given()
          .when().get("/hello/polite")
          .then()
             .statusCode(404));
        
    }

}