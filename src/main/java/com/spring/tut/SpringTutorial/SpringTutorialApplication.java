package com.spring.tut.SpringTutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
			//BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

			Triangle triangle=(Triangle)context.getBean("triangle-alias");
			triangle.draw();
	}
}
