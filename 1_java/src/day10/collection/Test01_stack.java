package day10.collection;

import java.util.Stack;

public class Test01_stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");

		System.out.println(stack.empty());
		System.out.println(stack.search(stack));
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
		}
		System.out.println(stack.empty());
	}
}
