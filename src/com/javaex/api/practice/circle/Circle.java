//11.11
package com.javaex.api.practice.circle;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//	radius가 같으면 객체의 값이 같다고 가정
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {	//	Circl의 객체라면
			Circle other = (Circle)obj;	//	다운캐스팅
			return radius == other.radius;
		}
		return super.equals(obj);
	}
	
}
