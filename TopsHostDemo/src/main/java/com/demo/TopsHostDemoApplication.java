package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TopsHostDemoApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(TopsHostDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String display()
	{
		return "Welcome it's working now";
	}

	
}
