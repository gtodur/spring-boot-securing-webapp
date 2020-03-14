package com.df.springboot.securing.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;

@SpringBootApplication
public class SpringBootSecuringWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecuringWebappApplication.class, args);
	}

}
