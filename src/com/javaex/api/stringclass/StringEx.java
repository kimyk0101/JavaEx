//11.11-6
package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();

	}

	private static void stringBasic() {
		String s1 = "Java";	//	리터럴(소스코드에 직접 명시된 데이터 자체)
		String s2 = new String("Java");	//	메모리에 새로 만들기
		String s3;
		s3 = "Java";	//	리터럴
		
		System.out.println(s1 == s2);	//	주소 비교, false
		System.out.println(s1 == s3);	//	주소 비교, true
		
		//	문자열 배열로 String 생성
		char[] letters = {'J', 'a', 'v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', '!'};
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(s4.length());
		
		//	valueOf 메서드
		//	-> 다른 데이터타입을 문자열로 변환하는 메서드
		float PI = 3.14159f;
		String s5 = String.valueOf(PI);	//	실수 데이터를 문자열로 변환
		System.out.println(s5);
	}
}
