package review;

public class Ex08 {
	//void ������ ����. add�� �����̸� ()�� �Լ���� ��
	//int a, b => �Ű�����(arguments)
	void add(int a,int b) {
		System.out.println(a+b);
	}
	int minus(int n1, int n2) {
		return n1-n2; //�Լ��� ȣ���� ������ ���� n1-n2�� �����.
	}
	public static void main(String[] args) {
		
		Ex08 e = new Ex08();
		// 1,2 �� �μ���� �θ�.
		e.add(1, 2); //�Լ��� ȣ��(13�� ���ο��� 7������ ���� �� �ٽ� 13�� �������� ���ƿ�)
		
		int result = e.minus(10, 5);
		System.out.println(result);
	}

}
