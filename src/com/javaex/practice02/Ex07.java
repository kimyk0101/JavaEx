package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		if (0 <= age && age < 8) {
			System.out.println("취학전아동//무료입니다.");
		} else if(8 <= age && age < 14){
			System.out.println("초등학생//2000원 입니다.");
		} else if(14 <= age && age < 17){
			System.out.println("중학생//3000원 입니다.");
		} else if(17 <= age && age < 20){
			System.out.println("고등학생//4000원 입니다.");
		} else
			System.out.println("성인//5000원 입니다.");
		scanner.close();
	}
}
