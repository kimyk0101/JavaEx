package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			
			int num = scanner.nextInt();
			
			switch (num) {
				case 1:
					System.out.print("예금액>");
					deposit = scanner.nextInt();
					balance += deposit;
					break;
					
				case 2:
					System.out.print("출금액>");
					withdraw = scanner.nextInt();
					balance -= withdraw;
					break;
					
				case 3:
					System.out.println("잔고액>" + balance);
					break;
					
				case 4:
					System.out.print("프로그램종료");
					run = false;
					break;
					
				default:
					System.out.println("다시입력해주세요");
                    break;
			}
		}
		scanner.close();
	}

}
