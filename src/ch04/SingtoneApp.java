package ch04;

class President {
	private static President instance = new President();
	
	public static President getInstance() {
		return instance;
	}

	public static void setInstance(President instance) {
		President.instance = instance;
	}

	private President() {
		
	}
}
public class SingtoneApp {

	public static void main(String[] args) {
		President p = President.getInstance(); //싱글톤 패턴
		//객체를 한번만 만들어주는 패턴!
		

	}

}
