package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
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
