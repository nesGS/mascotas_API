package com.nestor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class OpenApiConfig {
	
	/*
	@Configuration
	@EnableOpenApi
	public class OpenAPIConfig {

	    @Bean
	    OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("Mascota API para albergue de mascotas")
	                        .description("Para obtener toda la info de las mascotas listadas")
	                        .version("1.0")
	                        .termsOfService("https://github.com/nesGS")
	                        .contact(new Contact()
	                                .name("Nestor Gonzalez")
	                                .url("https://www.nesGS.com")
	                                .email("nesgonsua@gmail.com")));
	    }
	}*/
}