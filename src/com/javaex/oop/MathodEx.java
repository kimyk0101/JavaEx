//11.06-5, 11.07-1
package com.javaex.oop;

public class MathodEx {

	//	메서드 작성 연습
	//	매개변수 -> 입력, 리턴 -> 출력
	public static void main(String[] args) {
//		 	매개변수 x, 리턴 x 
//		printMessage();
		
		//	 매개변수 x, 리턴 o
//		String message = getMessage();
//		System.out.println("getMessage:" + message);
		
		//	매개변수 o, 리턴 x
//		printSum(10,20);
		
		//	매개변수 o, 리턴 o
//		System.out.println(getSum(10,20));
//		System.out.println(getSum(10,20,30));
		
		//	매개변수 개수를 알 수 없을 때의 해결방법
		//	방법1 : 배열 전달
		System.out.println("getSumArr:" + getSumArr(new double[] {1, 2, 3, 4, 5, 6, 7, 8}));
		
		//	방법2 : 가변인수 사용
		System.out.println("getSumVar:" + getSumVar(1, 2, 3, 4, 5, 6, 7, 8));
		
		//	일반 매개변수와 가변 매개변수를함께 사용할 때
		//	일반 매개변수 먼저, 가변 매개변수 나중에 선언
		printSum("합산값", 1, 2, 3, 4, 5, 6, 7, 8);
	}
	
	private static void printSum(String message, double ... values) {
		System.out.println(message + ":" + getSumVar(values));
	}
	
	private static double getSumArr(double[] values) {
		double total = 0;
		
		for (int i =0; i < values.length; ++i) {
			total += values[i];
		}
		return total;
	}
	
	private static double getSumVar(double ... values) {	//	가변인수
		double total = 0;
		
		for (double value : values) {	//	values에서 하나씩 꺼내서 value로 넣어줌, 향상된 for문
			total += value;
		}
		return total;
	}
	
	
	//	매개변수 x -> 파라미터 없음
	//	리턴 x -> void
	private static void printMessage() {
		System.out.println("매개변수 없고, 리턴도 없음");
	}
	
	//	매개변수 x -> 파라미터 없음
	//	리턴 o -> 리턴 데이터 타입 명시
	private static String getMessage() {
		//	return으로 데이터 반환
		return "입력은 없지만, 출력은 있는 메서드";
	}
	
	//	매개변수 o -> 파라미터 있음
	//	리턴 x -> void
	private static void printSum(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	//	매개변수 o -> 파라미터 있음
	//	리턴 o -> 리턴 데이터 타입 명시
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	//	매서드 오버로딩 (초과적재) => 다형성의 일부
	private static double getSum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
}
