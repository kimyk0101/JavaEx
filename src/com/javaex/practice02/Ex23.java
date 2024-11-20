package com.javaex.practice02;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요");
		
		System.out.print("년도: ");
		int year = scanner.nextInt(); 
		int thisYear = 2023;
		System.out.println("올해:" + thisYear);
		System.out.println("태어난해:" + year);
		
		int age = 2023 - year;
		System.out.println("나이:" + age);
		System.out.println("==============================");
		
		if (20 <= age) {
			System.out.println("20살 이상");
			if (year%2 == 0) {
				
				if(thisYear%2 == 0) {
					System.out.println("건강검진해");
					
					if (40 <= age) {
						System.out.println("암 검사");
					} else {
						System.out.println("암 검사x");
					}
					
				} else {
					System.out.println("건강검진해 아님");
				}
				
			} else if (year%2 != 0) {
				
				if(thisYear%2 != 0) {
					System.out.println("건강검진해");
					
					if (40 <= age) {
						System.out.println("암 검사");
					} else {
						System.out.println("암 검사x");
					}
	
				} else {
					System.out.println("건강검진해 아님");
				}		
			} 
		} else {
			System.out.println("20살미만 건강검진대상이 아님");
		}
		scanner.close();
	}
}

