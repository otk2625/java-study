package test;

import ch05.BlueCloth;
import ch05.Factory;

public class FactoryApp {

	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
//		f1.색칠();//동적바인딩
//		f1.건조();
		f1.가동();
	}
}
