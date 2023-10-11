package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/candidats/**")
                        .uri("http://localhost:8088/")
                ).build();

//Micro-service 2
//                .route(r -> r.path("/consumer/**")
//                        .uri("http://localhost:8082/")
//                       .id("consumerModule"))

    }

}
