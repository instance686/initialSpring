package com.spring.tut.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
			context = new ClassPathXmlApplicationContext("spring.xml");
			Shape shape=(Shape)context.getBean("circle");
			shape.draw();
	}
}
