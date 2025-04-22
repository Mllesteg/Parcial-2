package com.example.Parcial.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI(){
    return new OpenAPI()
            .info(new Info()
                    .title("PARCIAL")
                    .version("1.1")
                    .description("Documentación Parcial")
                    .contact(new Contact()
                            .name("Alejandro Londoño")
                            .email("edwinlondono@ucundinamarca.edu.co")));



    }
}
