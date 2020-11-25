package ch13;
class NewThread extends Thread {
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}

public class Thread02 {
	public static void main(String[] args) {
		//1. 스레드 객체생성
		
		//2. 타겟 설정
		
		//3. 실행
		
		Thread t1 = new Thread(new NewThread()/*Target*/);
		t1.start();
		
		//이거 자체가 타겟이니까 이렇게 사용하기도 함. 이렇게 사용안하는걸 추천 위에거랑 같음
		NewThread t2 = new NewThread();
		t2.start();
	}
}
