package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============================");
		System.out.println("       [숫자맞추기게임 시작]");
		System.out.println("==============================");
		
		boolean run = true;
		int secret = (int)(Math.random() * 100) + 1;
		
		while(run) {
			System.out.print(">>");
			
			int num = scanner.nextInt();
			if (num < secret) {
				System.out.println("더 높게");
			} else if (num > secret) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				
				String answer = scanner.next();
				
				if (answer.equals("y")) {
					System.out.println("==============================");
					System.out.println("       [숫자맞추기게임 종료]");
					System.out.println("==============================");
					run = false;
				} else if (answer.equals("n")) {
					run = true;
				}
			}
			
		}
		scanner.close();
	}

}
