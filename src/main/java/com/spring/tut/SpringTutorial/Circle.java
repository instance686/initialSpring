package com.spring.tut.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point center;
	

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
	}
	

}
