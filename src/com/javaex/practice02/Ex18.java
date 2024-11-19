package com.javaex.practice02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		
		System.out.print("알파벳: ");
		String string = scanner.next(); 
		
		switch (string) {
			case "a":
				System.out.println("모음입니다.");
				break;
			case "e":
				System.out.println("모음입니다.");
				break;
			case "i":
				System.out.println("모음입니다.");
				break;
			case "o":
				System.out.println("모음입니다.");
				break;
			case "u":
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
			}

		scanner.close();
	}
}

