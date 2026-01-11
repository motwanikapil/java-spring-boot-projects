package com.kapil.springbootpractice.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// inside jvm -> spring context -> (suppose we are managing name )
		
		// 1. launch a spring context
		// below thing is known as try with resources.
		try(var context = 
				new AnnotationConfigApplicationContext(
						HelloWorldConfiguration.class
						)) {
			// 2. configure the things that we want spring to manage - 
			// HelloWorldConfiguration - @Configuration
			// name - @Bean 
					
			// 3. Retrieving beans managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
//			System.out.println(context.getBean("address2")); // we can use name of the bean or type of the bean
			System.out.println(context.getBean("person2MethodCall"));
//			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person3"));
//			System.out.println(context.getBean(Address.class)); // we can use name of the bean or type of the bean
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("person5Qualifier"));
//			@Qualifier("address3qualifier")
		}
	}
}
