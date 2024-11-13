//11.11
package com.javaex.api.objectclass.ex01;
//	object ex01
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//	필드 정보 출력
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
}
