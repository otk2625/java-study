package ch13;

public class Thread03 {

	static int sum = 0;
	
	static class NewThread extends Thread { //���� Ŭ���� �Ҷ� static class
		@Override
		public void run() {
			System.out.println("���ο� ������ ����");
			for (int i = 0; i < 10; i++) {
				sum += 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println("ok");
				}
			}
			System.out.println("���ο� ������ ��");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main������ ����");
		
		Thread t1 = new Thread(new NewThread());
		t1.start();
		try {
			t1.join(); //t1�� ������ ���� ����ϴ� �ڵ� 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println("main������ ����");
	}

}
