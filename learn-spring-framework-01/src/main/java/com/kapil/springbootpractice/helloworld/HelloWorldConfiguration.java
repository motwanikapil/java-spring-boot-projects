package com.kapil.springbootpractice.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// to eliminate verbosity in creating java beans 
// public accessor methods, constructor, equals, hashcode, and toString are automatically created.
// release in jdk 16.
record Person (String name, int age, Address address) {};
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
		return new Person("Krishna", 25, new Address("Baker street", "London"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address2());
	}
	
//	@Bean(name = "address")
//	public Address address() {
//		return new Address("Baker street", "London");
//	}
	
	@Bean(name = "address2")
	@Primary
	public Address address2() {
		return new Address("Kukatpally", "Hyderabad");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}
	
	@Bean(name = "person3")
	public Person person3Parameters(String name, int age, Address address3) {
		// parameters are matched with bean names
		// this is auto wiring with parameters
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address3) {
		// parameters are matched with bean names
		// this is auto wiring with parameters
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
}
