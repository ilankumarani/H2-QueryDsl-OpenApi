package com.ilan.h2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}


	@Bean
	public CommandLineRunner startup() {

		return args -> {


		};

	}
}
