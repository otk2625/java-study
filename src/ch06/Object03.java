package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "ȫ�浿"; //���� ������ : �ּ�
		String str2 = "ȫ�浿"; // ������ : ��
		
		// == �� ������ �������� �޸� ������ ������ ��
		System.out.println(str1 == str2);//true
		
		//String�� Hash�Լ��� �������̵� �Ǽ�
		//���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		String str3 = "�Ӳ���"; //Heap������ Constant Pool
		String str4 = new String("�Ӳ���");//Heap������ String����
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3 == str4);//false ���������� �ּҰ� �޶�
		
		//equals()��  ==���� ���� ��, ������ true
		//==���� ���ߴµ� false�� ������ ���������� ���� ��
		//�Ϲ����� �͵��� ==���� ��, ���ڿ���equals()���!
		System.out.println(str3.equals(str4));
	
		
	}
}
