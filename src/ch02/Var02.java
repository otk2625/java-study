package ch02;


public class Var02 {
	public static void main(String[] args) {
		//code�κ�
		int num = 10; //4byte 32bit 42��9õ(-20�� ~ +20��)
		long num2 = 10; //8byte
		
		char s = 'A'; //2byte
		
		double d = 7.5; //8byte 42��9õ(-20�� ~ +20��) + �Ҽ��� ����
		
		boolean b = true; // 1bit
		
		num = (int)d;  //����� ����ȯ(�ٿ� ĳ���� - �ڷ� ����)
		num = (int)num2; //����� ����ȯ(�ٿ� ĳ����)
		num2 = num; //������ ����ȯ(�� ĳ����)
		
	}//end of main
}
