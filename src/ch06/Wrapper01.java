package ch06;

import java.sql.Wrapper;

public class Wrapper01 {
	
	public static void main(String[] args) {
		int num = 10; //4Byte
		Integer num2 = 20; //���۷���
		String num3 = num2.toString(); //���ڸ� ���ڿ���
		System.out.println(num3);
		
		String num4 = num + "";
		String num5 = "10";
		int num6 = Integer.parseInt(num5); //���ڿ��� ���ڷ�
		System.out.println(num6);
		
	}
}
