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
		System.out.println(size + "ÀÎÄ¡ " + mf);
	}
}

public class TVApp {

	public static void main(String[] args) {
		new TV1();
		new TV1("»ï¼º");
		new TV1(65, "»ï¼º");
		
	}

}
