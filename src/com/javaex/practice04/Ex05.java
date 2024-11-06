package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		averEx();

	}

	private static void averEx() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i < 5; ++i) {
			num = scanner.nextInt();
			sum += num;
		}	
		System.out.println("평균은" + sum + "입니다.");
		scanner.close();
	}

}
