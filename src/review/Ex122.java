package review;

//�ڹٿ����� �޼��带 �Լ��� �Ű������� ������ �� ����.
//�ڹٴ� �޼��带 �Լ��� �Ű������� �����ϰ� ������ ������ �������̽���
//�Լ��� ��´�.
//�͸�Ŭ������ �ѱ��.
class ����� {
	String ������;
	
	String �ٿ�ε�() {
		������ = "GTA5 ����";
		try {
			Thread.sleep(5000); //1000 = 1��
		} catch (InterruptedException e) {
			System.out.println("������");
		} 
		return ������;
	}
}

public class Ex122 {
	public static void main(String[] args) {
		����� s = new �����();
		String game = s.�ٿ�ε�();
		System.out.println(game + "����");
		System.out.println("asdasd");
		
	}
}
