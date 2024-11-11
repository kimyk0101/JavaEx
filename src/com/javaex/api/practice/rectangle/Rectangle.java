//11.11-5
package com.javaex.api.practice.rectangle;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//	구해지는 면적이 같으면 같은 것으로 판별
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return width*height == other.width*height;
		}
		return super.equals(obj);
	}
}
