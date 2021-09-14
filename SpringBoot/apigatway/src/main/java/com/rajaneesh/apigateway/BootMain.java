package com.rajaneesh.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableZuulProxy
public class BootMain {
	public static void main(String[] args) {
		SpringApplication.run(BootMain.class, args);
		System.out.println("Main Classess stated now");
	}
}
