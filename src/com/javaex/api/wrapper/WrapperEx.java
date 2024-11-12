//11.12-2
package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//	Wrapper 클래스 생성
		//	new Wrapper는 jdk9부터 deprecated -> 가급적 빨리 수정 권장
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		//	정상적인 생성법 .valueOf
		Float f = Float.valueOf(3.14156f);
		Boolean b = Boolean.valueOf(true);
		
		//	문자열로 된 데이터를 실제 데이터로 생성하는 작업
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf("3.14159");
		Boolean b2 = Boolean.valueOf("true");
		//	주의: 문자열의 형태가 해당 자료형의 형태를 갖춰야 한다
		
		//	parse 계열 메서드 : 문자열을 이용, 해당 타입으로 변환, 출력 형태 변환하는 경우
		System.out.println(Integer.parseInt("-123"));	//	문자열 -> 정수
		System.out.println(Integer.parseInt("10", 16));	//	16진수 문자열 -> 10진수 정수
		System.out.println(Integer.toBinaryString(28));	//	2진수 형태 문자열로 변환
		System.out.println(Integer.toHexString(28));	//	16진수 형태 문자열로 변환
		
		String s1 = "123";
		String s2 = "456";
		System.out.println(s1 + s2);	//	문자열에서 +는 연산이 아닌 연결기호
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));	//	정수로 변환해서 연산
		
		//	형변환
		System.out.println(i2.doubleValue());
		
		//	자동 박싱(Auto Boxing)
		Integer i3 = 10;	//	=> Integer i3 = Integer.valueOf(10);
		
		//	포장된 값의 비교
		Integer i4 = Integer.valueOf(2024);
		Integer i5 = Integer.valueOf(2024);
		
		System.out.println(i4 == i5);	//	객체이므로 참조주소 비교 => false
		
		//	언박싱 비교
		System.out.println(i4.intValue() == i5.intValue());	//	기본데이터 타입으로 변환 후 값의 비교 => true
		
		System.out.println(i4.equals(i5));	//	참조 데이터 타입의 값의 비교 => ture
	}

}
