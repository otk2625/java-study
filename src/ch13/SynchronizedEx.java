package ch13;

class SharedThred{
	private int sum = 0;
	//임계구역 다른 스레드가 접근할때 Block
	synchronized public void add() { //동기화 synchronized
		int n = sum;
		Thread.yield(); //현재 실행중인 스레드 양보
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
		super(name); //Thread이름
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
		
		//스레드 실행
		t1.start();
		t2.start();

	}
}
