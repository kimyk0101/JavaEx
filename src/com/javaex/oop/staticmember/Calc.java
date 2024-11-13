//11.08
package com.javaex.oop.staticmember;

//	생성하지 않고도 사용할 수 있는 정적 클래스 (new로 인스턴스를 생성하지 않아도 불러올 수 있음)
public class Calc {
	//	static final 상수
	public static final double PI = 3.14159f;
	public static double getSum(double ... values) {
		double total = 0;
		
		for (double value : values) {
			total += value;
		}
		return total;
	}
}
