package com.seb.compositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.seb.entities"})

public class CompositeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeServiceApplication.class, args);
	}
}
