package com.spring.tut.SpringTutorial;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle{
		private Point pointA;
		private Point pointB;
		private Point pointC;
		
		
		public Point getPointA() {
			return pointA;
		}


		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}


		public Point getPointB() {
			return pointB;
		}


		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}


		public Point getPointC() {
			return pointC;
		}


		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}


		public void draw() {
			
			System.out.println("PointA = ("+getPointA().getX()+","+getPointA().getY()+")");
			System.out.println("PointB = ("+getPointB().getX()+","+getPointB().getY()+")");
			System.out.println("PointC = ("+getPointC().getX()+","+getPointC().getY()+")");
		}

		
		public void myInit() {
			System.out.println("MyInit method called for Triangle");

		}
			
		public void cleanUp() {
			System.out.println("MyDestroy method called for Triangle");	
		}

		
}
