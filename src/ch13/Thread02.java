package ch13;
class NewThread extends Thread {
	@Override
	public void run() {
		System.out.println("���ο� ������");
	}
}

public class Thread02 {
	public static void main(String[] args) {
		//1. ������ ��ü����
		
		//2. Ÿ�� ����
		
		//3. ����
		
		Thread t1 = new Thread(new NewThread()/*Target*/);
		t1.start();
		
		//�̰� ��ü�� Ÿ���̴ϱ� �̷��� ����ϱ⵵ ��. �̷��� �����ϴ°� ��õ �����Ŷ� ����
		NewThread t2 = new NewThread();
		t2.start();
	}
}
