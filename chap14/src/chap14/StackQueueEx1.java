package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack 클래스 : LIFO(Last in First Out:후입선출)
 *              List 객체
 *              Vector 클래스의 하위 클래스
 *      push(Object o) : 객체를 stack에 저장. 추가
 *      Object pop()   : stack에 저장된 객체를 꺼냄. 제거(후 전달)
 *      Object peek()  : stack에 저장된 객체를 조회.
 *
 * Queue 인터페이스 : FIFO(First in First Out:선입선출)
 *                LinkedList 클래스가 구현 클래스임.
 *      offer(Object)  : 객체를 Queue에 저장. 추가
 *      Object poll()  : 객체를 Queue에서 꺼냄. 제거
 *      Object peek()  : Queue에 저장된 객체를 조회.
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String cars[]= {"소나타", "그랜저", "SM5", "K9"};
		Stack<String> stack = new Stack<>();
		for(String s: cars) stack.push(s);
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println(stack.peek());
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());

		Queue<String> queue = new LinkedList<>();
		for(String s:cars) queue.offer(s);
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	}

}
