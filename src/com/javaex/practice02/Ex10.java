package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1:");
		int a = scanner.nextInt();
		System.out.print("숫자2:");
		int b = scanner.nextInt();
		
		if(a > b) {
			System.out.println("큰수: " + a + "\t 작은수: " + b + "입니다.");
		} else {
			System.out.println("큰수: " + b + "\t 작은수: " + a + "입니다.");
		}
		scanner.close();
	}		
}
