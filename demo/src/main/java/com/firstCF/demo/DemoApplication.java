package com.firstCF.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RestController
	public static class CFController {

		@GetMapping(value="/greet/{name}")
		public String getName(@PathVariable String name) {
			return "Hi "+name+" from Cloud Foundry";
		}
	}


}
