package com.javaex.practice03;

public class Ex09 {

	public static void main(String[] args) {
		
		int num = 1;
		for (int i = 1; i < 10; ++i) {
			for (num = 1; num <= 10; ++num) {
				System.out.print(num + "\t");
			}
			++num;
			System.out.println();
		}
	}
}
