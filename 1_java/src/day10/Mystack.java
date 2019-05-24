package day10;

public class Mystack {

	private int[] stack;
	private int count = 0;

	public Mystack() {
		stack = new int[10];
	}

	public Mystack(int size) {
		if (size <= 0)
			stack = new int[10];
		else
			stack = new int[size];
//		stack = new int[size>0?size : 10];
	}

	public void push(int a) {
		if (isEmpty()) {
			count++;
			stack[count] = a;
//			stack[count++]=a;
		} else {
			System.out.println("스택이 가득 찼습니다.");
		}
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
//		return count==0?true:false;
	}

	public boolean isFull() {
		if (count == stack.length) {
			return true;
		}
		return false;
//		return count==stack.length?true:false;
	}

	public int top() {
		if (count==0) {
			return -1;
		}
		return stack[count - 1];
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int top = this.top();
			stack[count--] = 0;
			count--;
			return top;
		}
	}

}
