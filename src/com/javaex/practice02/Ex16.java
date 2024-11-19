package com.javaex.practice02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		
		System.out.print("숫자: ");
		int x = scanner.nextInt(); 
		double a = 0;
		
		if (x <= 0) {
			a = Math.pow(x, 3) -(9*x) + 2;
		} else {
			a = (7*x) + 2;
		}
		System.out.println("계산결과는 " + a + "입니다");
		scanner.close();
	}
}

