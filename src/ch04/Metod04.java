package ch04;

//�޼���ȿ� �޼��带 ������ �� ����.
//Ctrl + Shift + f - �ڵ� ����
//������ �޼��带 ���� �� ����.
public class Metod04 {
	int money = 10000; // heap����

	int add(int num) { // int num - stack���� , add() - heap����
		 int money2 = money + num;
		 return money2;
	}

	public static void main(String[] args) { // static����
		Metod04 m = new Metod04(); //
		
		int money2 = m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
	}

}
