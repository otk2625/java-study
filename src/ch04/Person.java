package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	public Person() { 
		//����Ʈ �����ڴ� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� ����
		//���� �����ڰ� ������ ����Ʈ �����ڸ� ����� ���� ����.
		//�� ��쿡�� ����Ʈ �����ڸ� ���� ����� ��� ��. (�����ε�, Ÿ�� ������ �ٸ�)
	}
	//�ʱ�ȭ�� ���� ������ , �ʱ�ȭ�� ���� �Լ� return�Ұ�
	public Person(String n, String j, int a, char g, String b) { 
		System.out.println("����� �¾");
		name = n;
		job = j;
		age = a;
		gender = g;
		blood = b;
	}
	
	void preview() {
		System.out.println("===="+name+"====");
		System.out.println("���� : " + job);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("������ : " + blood);
		System.out.println();
	}
}
