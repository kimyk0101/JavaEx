package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = scanner.nextInt();
		
		int y = 2023-year;
		if (65 <= y || y < 15) {
			System.out.println(y + "살 무료예방접종 대상자 입니다");
		} else {
			System.out.println(y + "살 무료예방접종 대상자가 아닙니다");
		}	
		scanner.close();
	}
}
