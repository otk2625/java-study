package ch04;

//�ڹ� Ư¡ : ��� �ڵ�� class ���ο� �ξ���Ѵ�.
public class Method01 {
		int num = 10; //heap����
		static int num3 = 10; //static����
		
		static void add() {
			System.out.println("add�Լ� ȣ���"); //�Լ� ������ stack
		}
		void sound() {
			System.out.println("sound�Լ� ȣ���");
		}
	public static void main(String[] args) {
		//stack����
		Method01.add();
		
		Method01 m = new Method01();
		m.sound();
	}

}
