package ch04;

class Cal { //계산기
	
	static void add(int n1, int n2) {
		System.out.println(n1 + n2); //클래스이름.함수이름 으로 호출
	}
	static int minus(int n3, int n4) {
		return n3 - n4;
	}
}

public class Method03 {
	public static void main(String[] args) {
		//n1을 찾고싶음
		Cal.add(5,6);
		
		int result = Cal.minus(10, 4); //마이너스 함수는 return타입이 int이기 때문데
//		//Cal.minus(10,4)가 호출된 후 메소드가 종료돠면
 	} //프로그램 종료
//	Cal.minus(10,4) --> 6으로 변경한다
	
	
}
