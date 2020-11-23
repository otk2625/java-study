package ch04;

//메서드안에 메서드를 정의할 수 없다.
//Ctrl + Shift + f - 코드 정렬
//변수에 메서드를 담을 수 없다.
public class Metod04 {
	int money = 10000; // heap공간

	int add(int num) { // int num - stack공간 , add() - heap공간
		 int money2 = money + num;
		 return money2;
	}

	public static void main(String[] args) { // static공간
		Metod04 m = new Metod04(); //
		
		int money2 = m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
	}

}
