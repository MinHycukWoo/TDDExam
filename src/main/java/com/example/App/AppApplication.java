package com.example.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public String getGreeting(){
		return "Hello world";
	}

	public static void main(String[] args) {
		//SpringApplication.run(JataTddApplication.class, args);
		System.out.println(new AppApplication().getGreeting());
	}

}
