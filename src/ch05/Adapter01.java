package ch05;

interface Knife {
	void 요리();
	void 상해();
}

//어댑터 용도
abstract class 요리사Adapter implements Knife {
	public void 상해() {
		//여기서 거름
	}
}

class 백종원 extends 요리사Adapter{ //상해를 구현 안해도 됨
	@Override
	public void 요리() {
		// TODO Auto-generated method stub
		
	}

}


public class Adapter01 {
	public static void main(String[] args) {
		
	}
}
