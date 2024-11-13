//11.12
package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue: 가장 먼저 입력된 자료가 먼저 출력 	
		//	First Input First Out(FIFO) : 선입선출 자료형
		//	입력 방향과 출력 방향이 반대
		
		//	Queue는 인터페이스, 실체 클래스는 LinkedList를 그냥 사용
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= 10; ++i) {
			queue.offer(i);	//	enqueue -> offer
			System.out.println("QUEUE:" + queue);
		}
		
		//	출력 방향의 데이터 확인
		System.out.println("PEEK:" + queue.peek());	//	확인만 할 뿐 인출(삭제)하지 않음
		
		//	인출
		while(!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());	
			System.out.println("QUEUE:" + queue);
		}

	}

}
