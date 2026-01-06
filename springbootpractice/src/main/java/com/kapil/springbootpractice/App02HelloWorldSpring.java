package com.kapil.springbootpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// inside jvm -> spring context -> (suppose we are managing name )
		
		// 1. launch a spring context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. configure the things that we want spring to manage - 
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
				
		// 3. Retrieving beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
	}
}
