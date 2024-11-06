package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		//	배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
		randomEx01();
	}

	private static void randomEx01() {
			for (int i = 0; i < 6; i++) {
				System.out.print((int)(Math.random() * 45) + 1);
				System.out.print("\t");
			}
			System.out.println();
	}

}
