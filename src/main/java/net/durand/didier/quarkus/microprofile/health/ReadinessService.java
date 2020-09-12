package net.durand.didier.quarkus.microprofile.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class ReadinessService implements HealthCheck {
	
	public static final String RESPONSE = "successful-readiness-check";
	
	@Override
	public HealthCheckResponse call() {
		return HealthCheckResponse.up(RESPONSE);
	}
}
