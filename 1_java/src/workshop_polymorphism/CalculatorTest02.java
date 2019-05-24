package workshop_polymorphism;

//cmd 에서 다시 실행하기
public class CalculatorTest02 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(a);
		String op = args[1];
		char opop = op.charAt(0);
		System.out.println(op);
		System.out.println(args[2]);
		System.out.println(op.length());
		int b = Integer.parseInt(args[2]);
		System.out.println(b);
		
		if (args.length >3 || args.length <3) {
			System.out.println("다시 입력하세요.");
			return;
		}
		Calculator c = new Calculator();
/*
  		if (op!="+" ||op!="-" ||op!="*" ||op!="/"  ) {
 
			System.out.println("다시 입력하세요.");
			return;
		}
		
		switch(op) {
		case "+" : System.out.println("결과 : "+c.plus(a, b));
			break;
		case "-" : System.out.println("결과 : "+c.minus(a, b));
			break;
		case "*" : System.out.println("결과 : "+c.multiplication(a, b));
			break;
		case "/" : System.out.println("결과 : "+c.divide(a, b));
			break;
			default : 
				System.out.println("다시 입력하세요.");
				return;
		}
		*/		switch(opop) {
		case '+' : System.out.println("결과 : "+c.plus(a, b));
			break;
		case '-' : System.out.println("결과 : "+c.minus(a, b));
			break;
		case 'x' : System.out.println("결과 : "+c.multiplication(a, b));
			break;
		case '/' : System.out.println("결과 : "+c.divide(a, b));
			break;
			default : 
				System.out.println("다시 입력하세요.");
				return;
		}
	}

}
