package ch13;

class Another implements Runnable { //Runable Ÿ���̾����
	//������� �ڵ�� = ����(������)
	public void run() {
		System.out.println("���ο� ������ ����");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run : "+ i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���ο� ������ ����");
	}
 //RunnableŸ���� �Ǿ�� ��.
	
	//������� �ڵ�� = ����(������)
//	@Override
//	public void run() {
//		System.out.println("���ο� ������ ����");
//		for (int i = 1; i < 11; i++) {
//			try {
//				System.out.println("run : "+ i);
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("������ ����");
//	}
}

public class Thread01 {
	public static void main(String[] args) {
		System.out.println("���� ������ �����");
		
		
		//���ο� ������ ���� 1. ������ ��ü ���� 2. Ÿ�� ���� 3. ����
		//�ѹ����� �������� �͸�Ŭ���� ���!!
		Thread t1 = new Thread(new Another()/*Ÿ��*/);
		t1.start(); 
		t1.getName();
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main : "+ i );
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���� ������ ����");
		
		
	}
}
