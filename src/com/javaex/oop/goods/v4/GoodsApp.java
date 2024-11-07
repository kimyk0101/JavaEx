//11.07-6
package com.javaex.oop.goods.v4;

//	Goods v4. this
//	this -> 현재 인스턴스 자체를 지칭
//	this(...) -> 현재 클래스 내부의 다른 생성자를 지칭
class Goods {
	//	필드
	private String name;
	private int price;
	
	//	생성자
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
//		this.name = name;
		this(name);	//	다른 생성자 호출
		this.price = price;
	}
	
	//	Getters / Setters
	public String getName() {	//	Getters
		return name;
	}
	
//	public void setName(String name) {	//	Setters
//		this.name = name;	//	this -> 현재 인스턴스 자체
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	일반 메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격: %,d원%n", price);
	}
}

//	Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();	
//		camera.setName("Nikon");
//		camera.setPrice(400_000);
		Goods camera = new Goods("Nikon", 400_000);
		camera.showInfo();
			
//		Goods desktop = new Goods();
//		desktop.setName("LG그램");
//		desktop.setPrice(900_000);
		Goods desktop = new Goods("LG그램", 900_000);
//		desktop.setPrice(1_000);
		desktop.showInfo();
		
//		Goods cup = new Goods();
//		cup.setName("머그컵");
//		cup.setPrice(2_000);
		Goods cup = new Goods("머그컵", 2_000);
		cup.showInfo();
	}

}
