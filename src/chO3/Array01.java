package chO3;

public class Array01 {

	public static void main(String[] args) {
		// ���� ������ �����͵��� ���������� ����ȴ�
		// ���� : �������� ����
		// ���� : �迭�� ũ�⸦ �ø��ų� ���� �� ����.
		int[] n = new int[3];
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		n[0] = 50;
		System.out.println(n[0]);
//		n[3] = 2; ArrayOutOfBoundException����
//		System.out.println(n[3]);

	}

}
