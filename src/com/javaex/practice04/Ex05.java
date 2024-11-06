package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		averEx();

	}

	private static void averEx() {
		int num[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < num.length; ++i) {
			scanner.nextInt();
			
		}	
		System.out.println("평균은" + sum + "입니다.");
		scanner.close();
	}

}
