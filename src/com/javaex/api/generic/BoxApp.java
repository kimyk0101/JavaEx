//11.12
package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		//	IntegerBox 만들기
		IntegerBox iBox = new IntegerBox();
//		iBox.setContent("문자열");
		
		//	어떤 객체든 담을 수 있는 박스를 설계 (모든 다 받아들이는 ObjectBox)
		ObjectBox intBox = new ObjectBox();
		intBox.setContent(123);
		
		//	값을 꺼내기
		Integer retVal = (Integer)intBox.getContent();	//	다운캐스팅 필요(위험)
		System.out.println(retVal);
		
		ObjectBox strBox = new ObjectBox();
		strBox.setContent("Java");
		
		//	값을 꺼내기
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		//	GenericBox
		//	내부 데이터 타입을 외부에서 객체화 시점에서 결정한다
		GenericBox<String> genericStrBox = new GenericBox<String>();
		genericStrBox.setContent("Generic Box");
//		genericStrBox.setContent(2024);	//	-> 컴파일 타임에서 내부 데이터 타임 체크 가능
		
		String objstr = genericStrBox.getContent();	//	캐스팅 불필요
	}

}
