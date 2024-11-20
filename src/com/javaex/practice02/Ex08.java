package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		float m = scanner.nextInt()/100f;
		
		System.out.print("몸무게: ");
		float kg = scanner.nextInt();
		
//		double BMI = kg / (Math.pow(m, 2));
		double BMI = kg / (m * m);
		
		if (18.5 <= BMI && BMI <= 24.9) {
			System.out.println("정상체중입니다.");
		} else if (18.5 > BMI){
			System.out.println("저체중입니다.");
		} else {
			System.out.println("과체중입니다.");
		}
		System.out.println("BMI:" + BMI);
		scanner.close();
	}

}


