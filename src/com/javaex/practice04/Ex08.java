package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)

		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((int) (Math.random() * 45) + 1);
			System.out.print("\t");
		}
	}
}
