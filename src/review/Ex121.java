package review;

//�ڹٴ� �Լ��� ������� ����.
//���ϱ� �Լ��� ����� ���� -> Ŭ������ �ʿ���.

//�޼ҵ� �ϳ� ������� �������̽� ���! -> ���°� �����ϱ�
interface A {
	void add();
}
public class Ex121 {

	public static void main(String[] args) {
		//�͸�Ŭ���� 
		//�������̽��� �͸�Ŭ������ ���� �� �ִ�.
		new A() {
			@Override
			public void add() {
				System.out.println("���ϱ�");
			}
		}.add();
	

	}

}
