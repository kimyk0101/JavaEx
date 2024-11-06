//11.06-4
package com.javaex.oop.goods.v2;

//	Goods v2. 접근제한자
class Goods {
	// 필드 선언
	private String name;
	private int price;
	// private 때문에 에러
}

//	Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//	생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
		camera.name = "Nikon";
		camera.price = 400_000;
		System.out.printf("%s -> %,d%n", camera.name, camera.price);
		
		Goods desktop = new Goods();
		desktop.name = "LG그램";
		desktop.price = 900_000;
		System.out.printf("%s -> %,d%n", desktop.name, desktop.price);
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2_000;
		System.out.printf("%s -> %,d%n", cup.name, cup.price);
		
				

	}

}
