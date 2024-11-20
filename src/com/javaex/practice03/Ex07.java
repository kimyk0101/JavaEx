package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = scanner.nextInt();
		int x = 1;
		int y = 1;
		
		while(x <= num) {
			while(y < x) {
				++y;
				System.out.print(y);
				}
			System.out.println(y);
			++x;
		}
		
		
		scanner.close();
	}
}
