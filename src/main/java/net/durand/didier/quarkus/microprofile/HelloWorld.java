package net.durand.didier.quarkus.microprofile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {
	
	public static final String BODY = "Hello. World!\n";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return BODY;
    }
    
}