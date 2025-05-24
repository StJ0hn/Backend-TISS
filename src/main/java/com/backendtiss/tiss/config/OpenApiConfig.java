package com.backendtiss.tiss.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API TISS",
                version = "1.0",
                description = "Documentação da API"
        )
)
public class OpenApiConfig {
}