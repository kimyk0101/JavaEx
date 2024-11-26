package com.javaex.practice04;

public class Ex08 {
	// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
	public static void main(String[] args) {
//		Lotto1();
		Lotto2();
}

	public static void Lotto1() {
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

	

	public static void Lotto2() {
        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;      
                }               
            }        
        }
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + "\t");
        }
	}
}
