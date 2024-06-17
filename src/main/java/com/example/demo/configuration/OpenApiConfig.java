package com.example.demo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI SwaggerDoc() {
        return new OpenAPI()
                .info(new Info()
                        .title("Design-Patters with spring")
                        .version("1.0")
                        .description("Criando aplicação spring e utilizando design patters")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("Gerson Fragoso")
                                .url("https://www.linkedin.com/in/gerson-fragoso-424b4721b")
                                .email("gersonfragoso.araujo@gmail.com")));
    }
}
