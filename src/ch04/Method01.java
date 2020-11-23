package ch04;

//자바 특징 : 모든 코드는 class 내부에 두어야한다.
public class Method01 {
		int num = 10; //heap영역
		static int num3 = 10; //static영역
		
		static void add() {
			System.out.println("add함수 호출됨"); //함수 내부의 stack
		}
		void sound() {
			System.out.println("sound함수 호출됨");
		}
	public static void main(String[] args) {
		//stack영역
		Method01.add();
		
		Method01 m = new Method01();
		m.sound();
	}

}
