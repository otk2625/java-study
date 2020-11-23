package review;

//TV4개, 삼성, LG, 대우, 일렉트론

//강제성 부여 
//사용자에게 편리한 인터페이스 제공
//프로그램짤때 실수 적게 발생
interface 리모콘 { 
	void change();
}

class 삼성리모콘 implements 리모콘 {
	@Override
	public void change() {
		System.out.println("삼성 채널변경");
	}
}

class LG리모콘 implements 리모콘 {
	@Override
	public void change() {
		System.out.println("LG 채널변경");
	}
}

public class Ex12 {
	
	static void 채널변경(리모콘 r) {
		r.change();
	}
	public static void main(String[] args) {
//		리모콘 r = new LG리모콘();
//		r.change();
//		리모콘 s = new 삼성리모콘();
//		s.change();
		채널변경(new LG리모콘());
		채널변경(new 삼성리모콘());
		
		//익명 클래스
		리모콘 r = new 리모콘() {
			
			@Override
			public void change() {
				System.out.println("안녕");
			}
		};
		r.change();
	}

}
