package ch02;

// heap
class Zealot {
	String name = "����";
	/*static*/ int attack = 10; //static ó������ ���� main�� ����Ǳ���
	int armor = 5;
	static int hp=0;
}

public class Var08 {
	public static void main(String[] args) { 
		Zealot z/*�����ڷ���*/ = new Zealot(); //static �� �ƴ� ������縦 ���¹� new������
		System.out.println(z.name); //12�� ���ο��� ���� ����
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot(); //17�� ���ο��� ���� ����
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z2.attack = 50;
		
		System.out.println("��ȭ ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp = 50;
		
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		//���� ���׷��̵�
		z.attack = 11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
		

	}
	
}
