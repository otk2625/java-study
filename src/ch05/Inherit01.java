package ch05;

//1. ����� ���� �޴� �ǹ�
class Father {
	int money =10000;
}

class Son extends Father {
	int money = 20000;
}

public class Inherit01 {
	
	public static void main(String[] args) {
		Son s = new Son(); //������
		//1����Ģ ������ ã�� �� ������ ������ �� ������ ���
		//������ ������ �θ� ã�� �ö� ����.
		System.out.println(s.money);
		
		//2�� ��Ģ new�� �ϸ� Father�� Son�� Heap�� ���.
		//�����ڴ� Son()�� ȣ���� �ȴ�.
		//����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f = new Son();
		System.out.println(f.money);
	}
}
