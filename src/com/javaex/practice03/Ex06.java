package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		int num = 1;
	
		while(num <= 100) {
			if(num%5 == 0 && num%7 == 0) {
				System.out.println(num);
			}
			++num;
		}

	}

}
