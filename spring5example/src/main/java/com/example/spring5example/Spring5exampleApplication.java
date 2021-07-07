package com.example.spring5example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.spring5example.models.User;

import reactor.core.publisher.Flux;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Spring5exampleApplication {

	/*@Bean
	public WebClient webClient(){
		return WebClient.create("http://localhost:8083/bank/users");
	}
	@Bean
	public CommandLineRunner commandLineRunner(WebClient webClient) {
		return string -> {
			webClient.get().uri("").retrieve().bodyToFlux(User.class).subscribe(System.out::println);
		};
	}*/
	/* @Bean
	    CommandLineRunner StockOnConsole() throws InterruptedException {
	        return args -> {
	                 StockGenerator.fluxAll().subscribe(System.out::println);
	                 //System.out.println(StockGenerator.ListAll());
	            };
	        };*/
	public static void main(String[] args) {
		SpringApplication.run(Spring5exampleApplication.class, args);
	}

}
