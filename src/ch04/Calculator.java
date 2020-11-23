package ch04;

public class Calculator {
	int add(int n1, int n2) {
		 return  n1 + n2; //호출시만 존재 stack(지역변수)
	}
	int minus(int n1, int n2) {
		return  n1 - n2;
	}
	int divid(int n1, int n2) {
		return  n1 / n2;
	}
	int multi(int n1, int n2) {
		return  n1 * n2;
	}
}
