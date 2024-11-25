package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int a = 1;
		
		for(int i = 1; i  <= num; i++) {
			a = a*i;
		}
		System.out.println("결과값: " + a);
		
		scanner.close();
	}
}
