package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		
		System.out.print("사번: ");
		int a = scanner.nextInt(); 
		if (a < 0 ) {
			System.out.println("잘못입력하셨습니다.");
		} else if (a == 0) {
			System.out.println("A팀입니다."); 
		} else if (a%3 == 0 ) {
			System.out.println("A팀입니다.");
		} else if (a%3 == 1) {
			System.out.println("B팀입니다.");
		} else {
			System.out.println("C팀입니다.");
		}
		scanner.close();
	}
}

