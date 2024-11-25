package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int a = 0;
		
		for (int i = 1; i <= num; i++) {
			a += i;
			if(i != num) {
				System.out.print(i + "+" );
			} else {
				System.out.print(i + "\n");
			}		
		}
		System.out.println("합계: " + a);
		
		scanner.close();
	}
}
