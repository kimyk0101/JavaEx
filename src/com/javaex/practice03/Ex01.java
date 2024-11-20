package com.javaex.practice03;

public class Ex01 {

	public static void main(String[] args) {
		//	코드의 출력 값을 예상하고 코드로 확인해 보세요.
		System.out.println("while문");
		int index = 0;
		while(index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for문");
		for(int order = 0; order<3; order++) {
			System.out.println("order=" + order);
		}

	}

}
