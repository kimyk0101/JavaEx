//11.01-1
package com.javaex;

//	Tip : Ctrl + Shift + O - Organize import
//	Tip2 : Ctrl + Space - 코드 자동완성
import java.util.Scanner;	//	Scanner 사용 시 꼭 필요
//	console
//	표준 입력 : stdin -> System.in
//	표준 출력 : stdout -> System.out
//	표준 에러 : stderr -> System.err
public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutput();
		consoleInput();

	}
	//	콘솔 입력 예제
	public static void consoleInput() {
		//	표준 입력 : stdin -> System.in
		//	데이터 소스로부터 입력을 받는 Scanner 클래스를 사용
		//	java.lang 이외의 기능을 불러올 때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
		//	이름과 나이를 물어봐서 출력하는 프로그램
		System.out.print("너 누구야? ");
		String name = scanner.next();
		System.out.print("나이는 몇 살이야? ");
		int age = scanner.nextInt();
		
		System.out.println("Welcome, " + name);
		System.out.println("당신의 나이는 " + age + "세입니다.");
		//	시스템 자원은 한정적이기 때문에 다 쓰고 돌려줘야 함
		//	자바는 없어도 자동으로 해제해 주기는 하나 즉시 해제하는 게 아니라서 즉시 해제해주는 것이 좋다	
		scanner.close();
	}
	
	//	콘솔 출력 예제
	public static void consoleOutput( ) {
		//	print : 개행 안함
		//	println : 개행 함
		//	printf : 형식 지정 문자열 출력 -> String 할 때
		System.out.print("Hello ");	//	개행 안함
		System.out.println("Java!");	//	개행 함
		
		//	이스케이프 문자
		System.out.println("Hello\nJava");	//	\n: 개행
		System.out.println("Hello\tJava");	//	\t: 탭
		System.out.println("Hello, \"Java!\"");
		
		System.out.println("\\: 역슬래시");	//	\는 이스케이프 문자로 인식, \\를 역슬래시로 인식
	}
	//	Git 테스트를 위한 임시 주석
}