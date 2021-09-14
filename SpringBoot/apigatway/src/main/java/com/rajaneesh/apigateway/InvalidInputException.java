package com.rajaneesh.apigateway;

public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidInputException(String string){
		
		 super("Invalid data...");
	}
}
