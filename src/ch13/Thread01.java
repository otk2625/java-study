package ch13;

class Another implements Runnable { //Runable 타입이어야함
	//실행단위 코드블럭 = 스택(스레드)
	public void run() {
		System.out.println("새로운 스레드 실행");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run : "+ i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료");
	}
 //Runnable타입이 되어야 함.
	
	//실행단위 코드블럭 = 스택(스레드)
//	@Override
//	public void run() {
//		System.out.println("새로운 스레드 실행");
//		for (int i = 1; i < 11; i++) {
//			try {
//				System.out.println("run : "+ i);
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("스레드 종료");
//	}
}

public class Thread01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 실행됨");
		
		
		//새로운 스레드 실행 1. 스레드 객체 생성 2. 타겟 설정 3. 실행
		//한번쓰고 버릴꺼면 익명클래스 사용!!
		Thread t1 = new Thread(new Another()/*타겟*/);
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
		System.out.println("메인 스레드 종료");
		
		
	}
}
