package util;

public class Calc {

	//연산 기능 제공
	

	public static double add(double a, double b){
		return a+b;
	}
	public static double sub(double a, double b){
		return a-b;
	}
	public static double mul(double a, Double  b){
		return a*b;
	}
	public static double div(double a, double b){
		return a/b;
	}
	public static int add(int  ...a){
		int sum=0;
/*
		for (int i=0; i<a.length; i++) {
			sum+= a[i];
		}*/
		for(int data:a) {
			sum+=data;
		}
		return sum;
	}
	public static int sub(int a, int b){
		return a-b;
	}
	public static int mul(int a, int b){
		return a*b;
	}
	public static  int div(int a, int b){
		return a/b;
	}

	public static int calculate(int data) {
		int sum=0;
		for(int i=1, j=0; i<=data; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		
		return sum;
	}
}
