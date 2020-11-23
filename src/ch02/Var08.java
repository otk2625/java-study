package ch02;

// heap
class Zealot {
	String name = "질럿";
	/*static*/ int attack = 10; //static 처음부터 존재 main이 실행되기전
	int armor = 5;
	static int hp=0;
}

public class Var08 {
	public static void main(String[] args) { 
		Zealot z/*참조자료형*/ = new Zealot(); //static 이 아닌 모든존재를 띄우는법 new연산자
		System.out.println(z.name); //12번 라인에서 질럿 생성
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot(); //17번 라인에서 질럿 생성
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z2.attack = 50;
		
		System.out.println("변화 관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp = 50;
		
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		//포지 업그레이드
		z.attack = 11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
		

	}
	
}
