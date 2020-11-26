package ch13;

class SharedThred{
	private int sum = 0;
	//�Ӱ豸�� �ٸ� �����尡 �����Ҷ� Block
	synchronized public void add() { //����ȭ synchronized
		int n = sum;
		Thread.yield(); //���� �������� ������ �纸
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() +   " : " + sum);
		
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}

class StudentThread extends Thread {
	private SharedThred board;
	
	public StudentThread(String name, SharedThred borad) {
		super(name); //Thread�̸�
		this.board = borad;
	}
	
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			board.add();
		}
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedThred board = new SharedThred();
		
		Thread t1 = new StudentThread("aaaa", board);
		Thread t2 = new StudentThread("b", board);
		
		//������ ����
		t1.start();
		t2.start();

	}
}
