package ch04;

class TV1{
	int size;
	String mf;
	
	public TV1() {
		this(32,"LG");
	}
	public TV1(String mf) {
		this(32, mf);
	}
	public TV1(int size, String mf) {
		this.size = size; 
		this.mf = mf;
		System.out.println(size + "��ġ " + mf);
	}
}

public class TVApp {

	public static void main(String[] args) {
		new TV1();
		new TV1("�Ｚ");
		new TV1(65, "�Ｚ");
		
	}

}
