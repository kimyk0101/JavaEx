//11.08-7
package com.javaex.oop.casting;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	 public void bark() {
		 System.out.println(name + ": 멍멍!");
	 }
}