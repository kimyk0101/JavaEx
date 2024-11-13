//11.11
package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

//	두 객체의 선후관계 비교를 위해 Compareable 인터페이스를 구현
class Member implements Comparable {
	//	필드
	String name;
	
	//	생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Member) {
			Member other = (Member)o;	//	다운캐스팅
			//	리턴값이 0 -> 순서가 같다
			//	리턴값이 -1 -> 순서가 앞선다
			//	리턴값이 1 -> 순서가 뒤다
			return name.compareTo(other.name);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
}

public class ArraysSortEx {

	public static void main(String[] args) {
//		basicSortTest();	//	기본 타입 오름차순 정렬
//		basicSortDescTest();	//	기본 타입 내림차순 정렬
		sortCustomClassTest();	//	사용자 저의 클래스 정렬
	}
	
	private static void basicSortTest() {
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("원본 배열:" + Arrays.toString(scores));
		
		Arrays.sort(scores);	//	소트의 기본은 오름차순
		System.out.println("오름차순 정렬:" + Arrays.toString(scores));	
	}
	
	private static void basicSortDescTest() {
		//	compareTo가 데이터의 선후 관계를 결정해주므로 기본 데이터타입은 역순 정렬을 할 수 없다
		//	따라서 기본데이터 타입을 객체 데이터타입으로 바꾸어 주어야 한다
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };	//	객체 포장에 집어넣음
		System.out.println("원본 배열:" + Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());	//	import 하기
		System.out.println("내림차순 정렬:" + Arrays.toString(scores));
	}
	
	private static void sortCustomClassTest() {
		 //	사용자 정의 클래스의 소팅
		Member m1 = new Member("홍길동");
		Member m2 = new Member("고길동");
		Member m3 = new Member("장길산");
		Member m4 = new Member("임꺽정");
		
		Member[] members = {m1, m2, m3, m4};
		System.out.println("원본배열:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("오름차순 배열:" + Arrays.toString(members));	//	어센딩
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("내림차순 정렬:" + Arrays.toString(members));	//	디센딩
	}
}
