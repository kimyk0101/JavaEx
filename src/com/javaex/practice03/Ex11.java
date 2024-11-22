package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		if(num == (num%2 = 0)) {
			for(int i = 0; i < num/2; i+2) {
				num += i;
				System.out.println("결과값: " + num);
			}
		}

	}

}
