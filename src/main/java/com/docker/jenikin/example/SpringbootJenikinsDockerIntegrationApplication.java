package com.docker.jenikin.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenikinsDockerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenikinsDockerIntegrationApplication.class, args);
		
		System.out.println("hello....");
	}

}
