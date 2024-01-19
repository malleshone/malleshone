package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMvcApplication.class, args);
		
		System.out.println("mvc main method is started");
	}

}
