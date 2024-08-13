package com.example.springdemo.sbr_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SbrDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbrDemoApplication.class, args);
	}

}
