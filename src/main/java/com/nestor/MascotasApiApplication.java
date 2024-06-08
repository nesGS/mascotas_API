package com.nestor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class MascotasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MascotasApiApplication.class, args);
	}

	
	// Clase para la documentación de la API a través de OpenApi
	@Configuration
	public class OpenAPIConfig {
	    @Bean
	    OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("Mascota API para albergue")
	                        .description("API para la unificación de las diferentes mascotas registradas en los albergues comarcales")
	                        .version("1.1")
	                        .termsOfService("https://github.com/nesGS")
	                        .contact(new Contact()
	                                .name("Néstor González Suárez")
	                                .url("https://www.nesGS.com")
	                                .email("nesgonsua@gmail.com")));
	    }
	}
}