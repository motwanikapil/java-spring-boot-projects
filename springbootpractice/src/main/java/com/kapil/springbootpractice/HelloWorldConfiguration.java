package com.kapil.springbootpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// to eliminate verbosity in creating java beans 
// public accessor methods, constructor, equals, hashcode, and toString are automatically created.
// release in jdk 16.
record Person (String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Kapil Motwani";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Krishna", 25);
	}
	
	@Bean
	public Address address() {
		return new Address("Gachibowli", "Hyderabad");
	}
}
