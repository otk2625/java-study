package ch04;

class TV{
	private String a;
	private int y;
	private int i;
	public TV(String a, int y, int i) {
		this.a = a;
		this.i = i;
		this.y = y;
	}
	void show() {
		System.out.println(a + "���� ���� " + y + "���� " + i + "��ġ TV");
	}
}

public class Test1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
