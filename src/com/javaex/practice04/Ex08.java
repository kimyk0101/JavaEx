package com.javaex.practice04;

public class Ex08 {
	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
		int arr[] = new int[6];
		int j =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			while (true) {
				arr[i] = (int)(Math.random() * 45) + 1;		
				if (arr[i] != j) {
					j = arr[i];
					break;
				}
				System.out.print(arr[i] + "\t");
				
				
			}
		}


		
	}
}








//int a[] = new int[50];
//for(int i = 1; i <= 45; i++) {
//	a[i] = i;
//}
//int prev = 0;
//int now;
//for (int i = 0; i < 6; i++) {
//	
//	while (true) {
//		now = (int)(Math.random()*45) + 1;
//		if (now != prev) {
//			prev = now;
//			break;
//		}
//	}
//	System.out.printf(a[now] + "\t");
//}