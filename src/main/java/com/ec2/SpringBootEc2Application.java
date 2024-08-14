package com.ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEc2Application.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello Word - GET";
	}
	@PostMapping("/hello")
	public String sayHelloPost(){
		return "Hello Word - POST";
	}

}
