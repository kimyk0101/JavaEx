package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		//	double 형 배열을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.
		
		float doubleArray[] = {
				1.2f,
				3.3f,
				6.7f
		};
			
		for (int i = doubleArray.length-1; i >= 0 ; --i) {
			System.out.println(doubleArray[i]);	
			
		}
	}

}
