package ch02;


public class Var02 {
	public static void main(String[] args) {
		//code부분
		int num = 10; //4byte 32bit 42억9천(-20억 ~ +20억)
		long num2 = 10; //8byte
		
		char s = 'A'; //2byte
		
		double d = 7.5; //8byte 42억9천(-20억 ~ +20억) + 소수점 이하
		
		boolean b = true; // 1bit
		
		num = (int)d;  //명시적 형변환(다운 캐스팅 - 자료 유실)
		num = (int)num2; //명시적 형변환(다운 캐스팅)
		num2 = num; //묵시적 형변환(업 캐스팅)
		
	}//end of main
}
