package com.example.GestiondePersonnelRevendeur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
public class GestionDePersonnelRevendeurApplication {

	/*@Bean
	@LoadBalanced // go discover other services
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}*/

	@Bean
	public WebClient.Builder getWebClientBuilder(){
		//        create a builder as creating a rest template
		return WebClient.builder();

	}

	public static void main(String[] args) {
		SpringApplication.run(GestionDePersonnelRevendeurApplication.class, args);
	}

}
