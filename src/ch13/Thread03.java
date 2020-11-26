package ch13;

public class Thread03 {

	static int sum = 0;
	
	static class NewThread extends Thread { //내부 클래스 할땐 static class
		@Override
		public void run() {
			System.out.println("새로운 스레드 시작");
			for (int i = 0; i < 10; i++) {
				sum += 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println("ok");
				}
			}
			System.out.println("새로운 스레드 끝");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main스레드 시작");
		
		Thread t1 = new Thread(new NewThread());
		t1.start();
		try {
			t1.join(); //t1이 끝날때 까지 대기하는 코드 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println("main스레드 종료");
	}

}
