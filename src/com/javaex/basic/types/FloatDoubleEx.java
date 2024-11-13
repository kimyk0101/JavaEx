//10.30
package com.javaex.basic.types;

//	float (4바이트 실수) < double (8바이트 실수)
//	실수형의 기본은 double
public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar = 3.14159F; //	대문자, 소문자 상관없음
		double doubleVar = 3.14159;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);

		//	e 표기법
		int intVar = 3000000; //	3 * 10 ^ 7
		doubleVar = 3E6;	//	3 * 10 ^ 6
		floatVar = 3e-6F;	//	3 * 10 ^ -6
		
		System.out.println("intVar:" + intVar);
		System.out.println("doubleVar:" + doubleVar);
		System.out.println("floatVar:" + floatVar);
		
		//	부동소수점 처리 유의사항
		//	float, double은 정밀도 포기, 표현 범위 넓힌 것
		//	정밀한 실수 계산을 할 때는 다룬 방법을 사용
		System.out.println(0.1*3);
		
	}

}
