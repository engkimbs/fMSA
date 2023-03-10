package com.engkimbs.sharedservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
@OpenAPIDefinition(info =
    @Info(title = "Shared Service API", version = "${springdoc.version}", description = "Documentation Shared Service API")
)
public class SharedServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedServiceApplication.class, args);
    }

}
