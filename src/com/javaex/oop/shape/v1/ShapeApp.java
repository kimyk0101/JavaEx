//11.08-5
package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		//	추상클래스는 실체화 불가, 부모로서만 존재
//		Shape s = new Shape();	
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();
	}

}

