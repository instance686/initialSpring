package com.spring.tut.SpringTutorial;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;

public class MyEventListenener implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}
}
