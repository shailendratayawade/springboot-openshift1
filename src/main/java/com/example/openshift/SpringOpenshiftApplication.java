package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {
	
	@RequestMapping("/")
	public String welcome() {
		
		return " Welcome to my openshift applicaitton";
	}
	
	@RequestMapping("/input")
	public String showinput(@PathVariable String input) {
		
		return "Hi "+input+" for entering data";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
