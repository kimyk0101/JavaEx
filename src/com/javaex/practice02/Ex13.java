package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int b = scanner.nextInt();
		
		if (a%b == 0 ) {
			System.out.println(b + " 는(은) " + a + " 의 약수입니다.");
		} else if (b%a == 0) {
			System.out.println(a + " 는(은) " + b + " 의 약수입니다.");
		} else {
			System.out.println(b + " 는(은) " + a + " 의 약수가 아닙니다.");
		}
		scanner.close();
	}

}
