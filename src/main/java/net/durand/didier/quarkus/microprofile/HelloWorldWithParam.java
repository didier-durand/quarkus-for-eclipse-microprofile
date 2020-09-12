package net.durand.didier.quarkus.microprofile;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldWithParam {
	
	@Inject
	private HelloService helloService;

	@GET
	@Path("/polite/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String greeting(@PathParam("name") String name) {
	    return helloService.politeHello(name);
	}
    
}