package review;

import lombok.Data;

//Ŀ���� �ڷ���
@Data //toString()�� �������̵���. Getter, Setter�� �������
class Product {
	private int no; // ��ǰ��ȣ
	private int price; //��ǰ����
	private String name; //��ǰ�̸�
	
}
public class Ex04 {

	public static void main(String[] args) {
		//Ŭ���� �ڷ���(�������� ������ Ÿ���� ���� ���� ��)
		Product t1 = new Product();
		System.out.println(t1);

	}

}
