package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		//	배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요.(중복체크)
		int i = 0;
		int j [] = new int[6];
		
		while (i < 6) {
			System.out.print((int)(Math.random() * 45) + 1);
			System.out.print("\t");
			//	앞의 방들과 비교해서 같으면 한 번 더 돌리기
			if (j[i] == j[i]) {
				j[i] = (int)(Math.random() * 45) + 1;
			}
			++i;
		}		
	}		
}
