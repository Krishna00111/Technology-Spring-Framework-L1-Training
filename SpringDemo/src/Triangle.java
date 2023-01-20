package org.chinmay.javabrains;
import org.springframework.beans.factory.IntializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {
	
	private List<Point> points;
	
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
//	
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
	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw() {
		
		System.out.println("Point A = (" + point.getX() +", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + point.getX() +", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + point.getX() +", " + getPointC().getY() + ")");
		
//		@Override
//		public void afterPropertiesSet() throws Exception{
//			System.out.println("InitializatingBean init method called for Triangle");
//			
//		}
//		
//		@Override
//		public void destroy() throws Exception {
//			System.out.println("DisposableBean destroy method called for Triangle");
//		}
		
		public void myInit() {
			System.out.println("My init method called for Triangle");
		}
		
		public void cleanUp() {
			System.out.println("My cleanup method called for Triangle");
			
		}


	}

	}
	
	


