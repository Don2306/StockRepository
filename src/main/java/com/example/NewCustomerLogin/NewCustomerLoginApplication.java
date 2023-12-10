package com.example.NewCustomerLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ={"com.example.service","com.example.controller","com.example.exceptionHandler"})
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
public class NewCustomerLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewCustomerLoginApplication.class, args);
	}

}
