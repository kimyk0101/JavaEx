//11.06-4, 11.07-2
package com.javaex.oop.goods.v2;

//	Goods v2. 접근제한자
class Goods {
	// 필드 선언
	//	정보는 은닉하고 Getter와 Setter를 통한 우회 접근 필요
	//	데이터를 다루는 (기능) 메서드 함께 구현
	private String name;
	private int price;
	
	//	Getters / Setters
	public String getName() {	//	Getters
		return name;
	}
	
	public void setName(String name) {	//	Setters
		this.name = name;	//	this -> 현재 인스턴스 자체
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	일반 메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격: %,d원%n", price);
	}
}

//	Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//	생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
//		camera.name = "Nikon";
//		camera.price = 400_000;
		camera.setName("Nikon");
		camera.setPrice(400_000);
		
//		System.out.printf("%s -> %,d%n", camera.name, camera.price);
//		System.out.printf("%s -> %,d%n", camera.getName(), camera.getPrice());
		
		camera.showInfo();
			
		Goods desktop = new Goods();
		desktop.setName("LG그램");
		desktop.setPrice(900_000);
//		System.out.printf("%s -> %,d%n", desktop.getName(), desktop.getPrice());
		desktop.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2_000);
//		System.out.printf("%s -> %,%n", cup.getName(), cup.getPrice());
		cup.showInfo();
	}

}
