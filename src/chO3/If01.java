package chO3;

public class If01 {
	public static void main(String[] args) {
		
		//ǥ����
		if(true) { //stack
			System.out.println("true�Դϴ�");
		}
		if(false) {
			System.out.println("false�Դϴ�");
		}
		
		int num = 0;
		if(num > 1) { // �񱳿����� '/'
			System.out.println("num�� 1���� ũ��");
		} else { // �װ� �ƴ϶��
			System.out.println("num�� 1���� �۴�");
		}
		
		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum�� 10�Դϴ�");
		} else if (sum == 20) {
			System.out.println("sum�� 20�Դϴ�");
		} else {
			System.out.println("sym�� 30�Դϴ�");
		}
		
	}
}
