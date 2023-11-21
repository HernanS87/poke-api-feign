package com.todocode.pokeApiFeing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokeApiFeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeApiFeingApplication.class, args);
	}

}
