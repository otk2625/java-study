package chO3;

public class If01 {
	public static void main(String[] args) {
		
		//표현식
		if(true) { //stack
			System.out.println("true입니다");
		}
		if(false) {
			System.out.println("false입니다");
		}
		
		int num = 0;
		if(num > 1) { // 비교연산자 '/'
			System.out.println("num은 1보다 크다");
		} else { // 그게 아니라면
			System.out.println("num은 1보다 작다");
		}
		
		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum은 10입니다");
		} else if (sum == 20) {
			System.out.println("sum은 20입니다");
		} else {
			System.out.println("sym은 30입니다");
		}
		
	}
}
