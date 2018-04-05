package com.spring.tut.SpringTutorial;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

public class Circle implements Shape,ApplicationEventPublisherAware{
	
	private Point center;
	private ApplicationEventPublisher publisher;
	

	public Point getPoint() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setPoint(Point point) {
		this.center = point;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn");
		System.out.println("Circle point is: ("+center.getX()+","+center.getY()+")");
		DrawEvent de=new DrawEvent(this);
		publisher.publishEvent(de);
		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		publisher=applicationEventPublisher;
	}
	

}
