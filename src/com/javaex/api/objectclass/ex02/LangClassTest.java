//11.11
package com.javaex.api.objectclass.ex02;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));	//	자바는 필드 데이터의 내부 객체를 비교할 줄 모름, 그래서 예상과 다르게 false 나옴
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1 == s2);	//	주소 같은지
		System.out.println(s1.equals(s2));	
	}

}
