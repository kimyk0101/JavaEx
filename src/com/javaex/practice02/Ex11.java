package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int b = scanner.nextInt();
		int c = a/b;
		int d = a%b;
		
		System.out.println("몫: " + c);	
		System.out.println("나머지: " + d);
		scanner.close();
	}
}
