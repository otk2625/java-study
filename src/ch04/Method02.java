package ch04;

class Dog {
	int ����� = 100; //����
	
	void eat() { //����
		����� = 10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //Heap
//		d1.����� = 10; //������ ���������� �ٲٴ� ������ ���� (������ �ȵ�)
		d1.eat();
		System.out.println("�������� ����� : " + d1.�����);
		System.out.println();
	}

}
