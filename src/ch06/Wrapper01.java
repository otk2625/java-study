package ch06;

import java.sql.Wrapper;

public class Wrapper01 {
	
	public static void main(String[] args) {
		int num = 10; //4Byte
		Integer num2 = 20; //레퍼런스
		String num3 = num2.toString(); //숫자를 문자열로
		System.out.println(num3);
		
		String num4 = num + "";
		String num5 = "10";
		int num6 = Integer.parseInt(num5); //문자열을 숫자로
		System.out.println(num6);
		
	}
}
