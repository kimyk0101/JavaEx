package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		if (19 <= age && age < 65) {
			System.out.println("1번그룹 입니다.");
		} else {
			System.out.println("2번그룹 입니다.");
		}	
		scanner.close();
	}
	
}
