package com.javaex.practice04;

/*public class Ex08 {
	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
		int arr[] = new int[6];
		
		int prev = 0;
		int now;
		for (int i = 0; i < arr.length; i++) {

			while (true) {
				now = (int)(Math.random() * 45) + 1;		
				if (now != prev) {
					prev = now;
					break;
				}
				
			}
			arr[i] = now;
			System.out.print(arr[i] + "\t");
		}	
	}
}*/


public class Ex08 {
	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
		int arr[] = new int[6];

		while (true) {
			for (int a = 0; a < arr.length; a++) {
				if (arr[a] == arr[++a]) {
					arr[++a] = (int)(Math.random() * 45) + 1;
				}
				System.out.print(arr[a] + "\t");
			}				
		}	
	}
}

