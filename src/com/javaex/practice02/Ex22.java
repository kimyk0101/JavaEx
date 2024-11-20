package com.javaex.practice02;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.print("숫자1: ");
		int a = scanner.nextInt();
		System.out.print("숫자2: ");
		int b = scanner.nextInt();
		System.out.print("숫자3: ");
		int c = scanner.nextInt();

		if (a>b && a>c) {
			System.out.println("가장 큰수는 " + a + " 입니다.");
		} else if(b>a && b>c) {
			System.out.println("가장 큰수는 " + b + " 입니다.");
		} else {
			System.out.println("가장 큰수는 " + c + " 입니다.");
		} 
		scanner.close();

	}

}
