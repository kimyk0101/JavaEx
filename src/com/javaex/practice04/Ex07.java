package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//	키보드에서 정수로 된 돈의 액수를 입력받아 각 몇 개로 변환되는지 작성하세요. 
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		
		int money = scanner.nextInt();
		int j = 0;
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		for (int i = 0; i < wonArray.length; ++i) {
			j = money / wonArray[i];
			System.out.println(wonArray[i] + "원: " + j + "개");
			money -= wonArray[i]*j;
		}
		scanner.close();
	} 	
}
