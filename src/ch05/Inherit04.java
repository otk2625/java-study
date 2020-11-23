package ch05;

//인터페이스 정의
//약속을 만드는 갑
//예 : 자동차 엑셀
//인터페이스는 new할 수 없다 왜냐면 추상메서드를 가졌기 때문.
interface Animal2 {
	void sound(); // 추상메소드 (함수의 몸체가 없다)
}

class Dog2 implements Animal2 {
	@Override // 무효화
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

}

class Cat2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("야용");

	}

}

class Bird2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("짹짺");

	}

}

class Tiger2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("어흔");

	}

}

// Monkey클래스를 만들고 (몽몽) 출력
// 반드시 Animal2를 구현하세여
class Monkey implements Animal2 {
	@Override
	public void sound() {
		System.out.println("몽몽");

	}

}

public class Inherit04 {

	static void start(Animal2 a) {
		a.sound();
	}

	public static void main(String[] args) {
//		자기자신의 클래스의 static을 호출시 클래스명 생략가능
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey());
	}

}
