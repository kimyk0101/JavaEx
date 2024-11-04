//11.04-3
package com.javaex.basic.flow;

public class FlowControllEx {

	public static void main(String[] args) {
//		continueEx();
//		breakEx();
//		forPractice01();
		forPractice02();
		
	}

	private static void continueEx() {
		//	continue : 반복 블록 내부에서 남아있는 문장을 실행하지 않고 다음번 루프로 진행
		
		//	1 ~ 100 루프를 돌면서 2의 배수와 3의 배수가 아닌 숫자만 출력
		//	루프 범위가 정해져 있으면 for, 정해져 있지 않으면 while
		for (int i =1;	//	초기화
			i <= 100;	//	반복 조건
			++i) {
			if (i % 2 == 0 || i % 3 == 0) continue;	//	하나면 {}블럭으로 묶지 않고 바로 써도 됨
			System.out.println(i);
		}		
	}
	
	
	private static void breakEx() {
		//	break : 반복 블록 내부에서 남아있는 문장은 실행하지 않고 블ㄹ록을 탈출한다
		
		//	6과 14로 모두 나누어 떨어지는 수를 구하자.
		int num = 1;	//	초기화
		while (true) {	//	어디까지 가야 저 값이 나올지 모르겠다.
			if (num % 6 == 0 && num % 14 == 0)
				break;	//	루프 탈출
			++num;
		}
		System.out.println("6과 14의 최소공배수(단순무식 버전):" + num);
	}	
	
	
	private static void forPractice01() {
		//	구구단 1 ~ 9단까지 출력
		
		for (int i = 2; i <= 9; ++i) {	
			for (int num = 1; num <= 9; ++num) {
				System.out.println(i + " * " + num + " = " + (i * num));}
		}
	}
		
	private static void forPractice02() {
		//	순서대로 늘어나는 별 출력
		
		for (int i = 1; i <= 5; i++ ) {
			for (int j = 1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}			
	}
	
	
}



/*루프 {	
	boolean bExit = false;
	루프 {


		bExit = true;
		break;
	}
	1) - 여기로 나오게 됨
	if (bExit) break;

}
2) - 여기로 나오고 싶으면 bExit로, 라벨 붙이는 방법도 있지만 거의 쓰지 않는 방법
 */
