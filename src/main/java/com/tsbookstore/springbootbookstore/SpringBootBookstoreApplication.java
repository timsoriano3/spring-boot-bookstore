package com.tsbookstore.springbootbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.profiles")
public class SpringBootBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookstoreApplication.class, args);
	}

}
