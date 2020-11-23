package review;

//자바는 함수만 만들수가 없다.
//더하기 함수를 만들고 싶음 -> 클래스가 필요함.

//메소드 하나 만드려면 인터페이스 사용! -> 상태가 없으니까
interface A {
	void add();
}
public class Ex121 {

	public static void main(String[] args) {
		//익명클래스 
		//인터페이스로 익명클래스를 만들 수 있다.
		new A() {
			@Override
			public void add() {
				System.out.println("더하기");
			}
		}.add();
	

	}

}
