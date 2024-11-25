package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
	
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				System.out.println(i);
			} 
		}
		scanner.close();
	}
}
