//10.31-5
package com.javaex.basic.opers;

//	
public class ArithOperEx {

	public static void main(String[] args) {
//		arithBasic();
		incrOpers();
	}

	private static void incrOpers() {
		//	증감 연산자 (1항 연산)
		// 	++, --
		//	앞에 붙으면 : 전위 증감
		// 	뒤에 붙으면 : 후위 증감
		int a = 7;
		System.out.println("전위 증감");
		System.out.println("a:" + a);
		System.out.println("++a:" + ++a);
		System.out.println("final a:" + a);
		
		System.out.println();
		System.out.println("후위 증감");
		a = 7;	//	원상복구
		System.out.println("a:" + a);
		System.out.println("a++:" + a++);
		System.out.println("final a:" + a);
		
	}
	
	private static void arithBasic() {
		//	기초 산술 연산자
		int a = 7, b = 3;
		
		System.out.println(a + b);		// 	덧셈
		System.out.println(a - b);		//	뺄셈
		System.out.println(a * b);		// 	곱셈
		System.out.println(a / b);		// 	나눗셈
		//	int / int -> int
		System.out.println(a % b);		// 	나머지
		
		System.out.println();		
		//	정수끼리의 나눗셈을 실수로 얻고자 한다면 (int / int -> float) : 캐스팅
		//	(파이썬의 경우 정수형과 정수형의 나누기에 실수형 결과값이 나옴)
		System.out.println((float)a / (float)b);		
		
		System.out.println((float)a / b);
		//	정수형 b 보다 실수형 a 가 그릇이 더 크므로 실수형으로 자동으로 캐스팅
		
	}
}
