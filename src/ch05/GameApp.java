package ch05;

public class GameApp {
	//���̽�ƽ
	static void start(Control c) {
		c.����();
		c.�극��ũ();
	}

	public static void main(String[] args) {
		Ferari f = new Ferari();
		start(f);
		
		Car t = new Truck();
		start(t);

	}

}
