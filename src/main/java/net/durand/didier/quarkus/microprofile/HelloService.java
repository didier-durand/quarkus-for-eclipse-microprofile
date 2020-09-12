package net.durand.didier.quarkus.microprofile;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
	public static final String GREETINGS = "Hello Mr/Mrs ";
	
    public String politeHello(String name){
        return GREETINGS + name;
    }
}