/* package com.gatewayserver;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FilterConfig {

    private final CustomFilter customFilter;

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                //first-micro-service
                .route(r -> r.path("/first-micro-service/**")
                        .filters(f -> f.filter(customFilter.apply(customFilter.newConfig())))
                        .uri("http://localhost:8081"))
                //second-micro-service
                .route(r -> r.path("/second-micro-service/**")
                        .filters(f -> f.filter(customFilter.apply(customFilter.newConfig())))
                        .uri("http://localhost:8082"))
                .build();
    }
} */