package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		Stack<String>stack = new Stack<String>();
		
		for (int i = 0; i < groupA.length; i++) { 	// L I F O  last in first out.
			stack.push(groupA[i]);					// 후입선출.
		}											// 스택메모리 의 구조.
		while(!stack.isEmpty())						// 메소드를 연속적으로 호출할때 발생.
			out.println(stack.pop());
	}
}
