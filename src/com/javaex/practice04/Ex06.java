package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		//	주어진 문자열의 공백을','(콤마)로 변경 후 출력하세요. 
		char c[] = {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for (char i = 0; i < c.length; ++i) {
			if (c[i] == ' ') {
				System.out.print(',');
			}
			System.out.print(c[i]);
		}

	}

}
