package ch04;

//���� 10�� 5�� ���ؼ� �� ��� ���� ����20�� ���ؼ�
//�� ��� ���� ���� 5�� ������
//�� ��� ���� 100�� �� ���� ȭ�鿡 ����Ͻÿ�
public class CalculatorApp {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.add(10, 5);
		result = cal.multi(20, result);
		result = cal.divid(result, 5);
		result = cal.minus(result, 100);
		System.out.println("��� �� : " + result);
	}

}
