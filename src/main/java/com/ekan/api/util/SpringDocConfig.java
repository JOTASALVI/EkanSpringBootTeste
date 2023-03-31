package com.ekan.api.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class SpringDocConfig {
	
	@Bean
	public OpenAPI baseOpenAPI() {
		return new OpenAPI().info(new Info().title("Projeto Teste EKAN").version("1.0.0").description("Crie uma aplicação utilizando Java e Spring Boot que forneça uma API REST para manter o cadastro\r\n"
				+ "de beneficiários de um plano de saúde."));
	}

}
