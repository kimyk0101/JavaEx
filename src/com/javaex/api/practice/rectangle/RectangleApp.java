//11.11
package com.javaex.api.practice.rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;

		System.out.println(a.equals(b));	//	true 가 나오려면?
		System.out.println(a.equals(c));	//	false
		System.out.println(a.equals(d));	//	false
		System.out.println(d.equals(c));	//	true
	}

}
