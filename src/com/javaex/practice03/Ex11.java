package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int a = 0;
		
		if(num%2 == 0) {
			for(int i = 0; i <= num; i+=2) {
				a += i;		
			}
			System.out.println("결과값: " + a);
		} else {
			for(int j = 1; j <= num; j+=2) {
				a += j;
			}
			System.out.println("결과값: " + a);
		}
		scanner.close();
	}
}
