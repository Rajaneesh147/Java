package com.rajaneesh.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler {

	@GetMapping("/testing")
	public String showData() {

		if(1 !=5) {
			
			throw new InvalidInputException("Employee Id is not valid");
		}
		return "Hi Java, How are you";
	}
}
