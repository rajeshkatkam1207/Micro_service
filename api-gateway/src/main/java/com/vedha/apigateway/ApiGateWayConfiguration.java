package com.vedha.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {

	@Bean
	public RouteLocator gateWayRouter(RouteLocatorBuilder builder) {
		
		return builder.routes()
			.route(p-> p.path("get")
					.filters(f-> f.addRequestHeader("MyHeade", "Myheader")
							.addRequestParameter("param", "Myvalue"))
					.uri("http://httpbin.org:80"))	
			.route(p-> p.path("/promotion/**")
					.uri("lb://promotion-service"))
			.route(p-> p.path("/promotion-feign/**")
					.uri("lb://promotion-service"))
			.route(p-> p.path("/retail/**")
					.uri("lb://vedha-retail"))
			.build();
		
	}
}
