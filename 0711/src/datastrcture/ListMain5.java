package datastrcture;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain5 {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack <String> stack = new Stack<>();
		stack.push("C");
		stack.push("C++");
		stack.push("Phython");
		stack.push("Java");
		//데이터가 역순으로 리턴합니다. - 제거되면서 리턴
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//우선순위큐 만들기
		PriorityQueue <String> queue = new PriorityQueue<>();
		queue.add("Oracle");
		queue.add("MySQL");
		queue.add("MSSQL");
		queue.add("Mongo DB");
		queue.add("Casandra");
		//크기가 작은 것부터 리턴 - Cassandra, MSSQL 순으로 리턴
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
