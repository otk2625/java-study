package ch04;

class Dog {
	int 배고픔 = 100; //상태
	
	void eat() { //행위
		배고픔 = 10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //Heap
//		d1.배고픔 = 10; //변수를 직접적으로 바꾸는 행위는 금지 (마법은 안됨)
		d1.eat();
		System.out.println("강아지의 배고픔 : " + d1.배고픔);
		System.out.println();
	}

}
