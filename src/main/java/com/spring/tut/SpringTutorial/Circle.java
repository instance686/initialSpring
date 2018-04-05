package com.spring.tut.SpringTutorial;

public class Circle implements Shape{
	
	private Point point;
	

	public Point getPoint() {
		return point;
	}


	public void setPoint(Point point) {
		this.point = point;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn");
		System.out.println("Circle point is: ("+point.getX()+","+point.getY()+")");
	}
	

}
