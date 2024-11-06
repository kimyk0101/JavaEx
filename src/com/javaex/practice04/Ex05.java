package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		averEx();

	}

	private static void averEx() {	
		//	5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[5];
		
		int sum = 0;
		float avr = 0;
		for (int i = 0; i < num.length; ++i) {
			num[i] = scanner.nextInt();
			sum += num[i];
					
		}	
		avr = sum / num.length;
		System.out.println("평균은 " + avr + " 입니다.");
		scanner.close();
	}

}
