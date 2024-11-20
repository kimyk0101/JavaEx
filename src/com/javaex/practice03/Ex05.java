package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {
		//	코드의 출력 값을 예상하고 코드로 확인해 보세요.
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
	}
}
