package com.javaex.practice02;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호: ");
		String sign = scanner.next(); 
		System.out.print("숫자1: ");
		float a = scanner.nextInt(); 
		System.out.print("숫자2: ");
		float b = scanner.nextInt(); 
		float result = 0;
		
		if (sign.equals("+")) {
			result = a+b;
			System.out.println("결과는: " + result);
		} else if(sign.equals("-")) {
			result = a-b;
			System.out.println("결과는: " + result);
		} else if (sign.equals("*")) {
			result = a*b;
			System.out.println("결과는: " + result);
		} else if (sign.equals("/")) {
			if (b==0) {
				System.out.println("계산할 수 없습니다.");
			} else {
			result = a/b;
			System.out.println("결과는: " + result);
			}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		scanner.close();
	}
}

