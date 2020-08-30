package com.example.RestApiDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
		System.out.println("Success");
	}

}
