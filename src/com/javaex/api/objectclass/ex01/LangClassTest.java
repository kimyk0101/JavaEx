//11.11
package com.javaex.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		Point p =new Point(10, 10);
		
		//	Java의 최상위 클래스는 object
		//	-> 기본적으로 object의 모든기능을 상속
		System.out.println(p.getClass().getName());	//	현재 인스턴스가 가지고 있는 클래스 이름
		System.out.println(p.hashCode());	//	객체 식별자, 메모리 주소
		System.out.println(p.toString());	//	객체 내부 데이터를 문자열로 출력(반환)
		System.out.println(p);	//	문자열 정보가 필요할 때, tostring()을 호출 (생략되어있음, 알아서 출력)
		
		//	p의 부모 객체를 받아와서 확인
		System.out.println(p.getClass().getSuperclass().getName());
	}

}
