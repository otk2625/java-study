package ch04;

public class CatApp {
	int x;
	public static int b;
	
	public static int f() {
		return b;
	}
	int g() {
		return f();
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("고양이1");
		c.setAge(1);
		c.setColor("파랑색");
		int y = CatApp.f();
	}

}
