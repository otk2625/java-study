package ch04;

//숫자 10과 5를 더해서 그 결과 값과 숫자20을 곱해서
//그 결과 값과 숫자 5로 나누고
//그 결과 값에 100을 뺀 값을 화면에 출력하시오
public class CalculatorApp {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.add(10, 5);
		result = cal.multi(20, result);
		result = cal.divid(result, 5);
		result = cal.minus(result, 100);
		System.out.println("결과 값 : " + result);
	}

}
