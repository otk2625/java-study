package ch04;

public class Test4_3 {
	int radius;
	String name;
	
	public Test4_3() {
		// TODO Auto-generated constructor stub
		radius = 1; name = "";
	}
	
	public Test4_3(int r, String n) {
		radius = r; name = n;
	}
	public double getArea() {
		double e = 3.14 * radius * radius;
		return e;
	}

	public static void main(String[] args) {
		Test4_3 pizza = new Test4_3(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적 " + area);
		
		Test4_3 donut = new Test4_3();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적 " + area);

	}

}
