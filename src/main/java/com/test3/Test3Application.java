package com.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test3Application {

	public static void main(String[] args) {
		String name="mike";
		int x =100;
		double y = 10.3;
		SpringApplication.run(Test3Application.class, args);
	}

}
