package com.javaex.practice03;

public class Ex08 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; ++i) {
			for (int num = 2; num < 10; ++num) {
				System.out.print(num + "*" + i + "=" + (num*i) + "\t");
			}
			System.out.println();
		}
	}
}
