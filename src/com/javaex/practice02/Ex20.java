package com.javaex.practice02;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String string = scanner.next();
			
		if (string == "a") {
			System.out.println("모음입니다.");
		} else if (string == "e") {
			System.out.println("모음입니다.");
		} else if (string == "i") {
			System.out.println("모음입니다.");
		} else if (string == "o") {
			System.out.println("모음입니다.");
		} else if (string == "u") {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}
		scanner.close();
	}

}
