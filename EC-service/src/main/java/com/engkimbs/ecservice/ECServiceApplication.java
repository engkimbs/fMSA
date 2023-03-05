package com.engkimbs.ecservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info =
    @Info(title = "EC API", version = "${springdoc.version}", description = "Documentation EC API")
)
public class ECServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECServiceApplication.class, args);
    }

}
