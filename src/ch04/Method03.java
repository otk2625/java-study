package ch04;

class Cal { //����
	
	static void add(int n1, int n2) {
		System.out.println(n1 + n2); //Ŭ�����̸�.�Լ��̸� ���� ȣ��
	}
	static int minus(int n3, int n4) {
		return n3 - n4;
	}
}

public class Method03 {
	public static void main(String[] args) {
		//n1�� ã�����
		Cal.add(5,6);
		
		int result = Cal.minus(10, 4); //���̳ʽ� �Լ��� returnŸ���� int�̱� ������
//		//Cal.minus(10,4)�� ȣ��� �� �޼ҵ尡 ����¸�
 	} //���α׷� ����
//	Cal.minus(10,4) --> 6���� �����Ѵ�
	
	
}
