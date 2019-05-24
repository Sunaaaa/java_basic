package day10;

public class StackTest {
	public static void main(String[] args) {
		Mystack ms = new Mystack();
		if (ms.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			ms.push(i);
		}

		if (ms.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + ms.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + ms.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + ms.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = ms.pop();
			if (num != -1)
				System.out.println(num);
		}
	}

}
