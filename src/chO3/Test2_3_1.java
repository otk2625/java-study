package chO3;

import java.util.Scanner;

public class Test2_3_1 {

	public static void asd(int n,int money) {
		if(n >= money) {
			n %= money;
			System.out.println(money+"�� " + n/money + "��");
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int n = sc.nextInt();
		int c = 0;
		int[] arr = {50000, 10000, 1000, 100, 10, 1};
		for (int i = 0; i < arr.length; i++) {
			asd(n, arr[i]);
		}
		
		
		if(n >= 50000) {
			c = n / 50000;
			n%=50000;
			System.out.println("�������� " + c + "��");
		}
		if (n >= 10000) {
			c = n / 10000;
			n%=10000;
			System.out.println("������ " + c + "��");
		}
		if (n >= 1000) {
			c = n / 1000;
			n%=1000;
			System.out.println("õ���� " + c + "��");
		}
		if (n >= 500) {
			c = n / 500;
			n%=500;
			System.out.println("����� " + c + "��");
		}
		if (n >= 100) {
			c = n / 100;
			n%=100;
			System.out.println("��� " + c + "��");
		}
		if (n >= 50) {
			c = n / 50;
			n%=50;
			System.out.println("���ʿ� " + c + "��");
		}
		if (n >= 10) {
			c = n / 10;
			n%=10;
			System.out.println("�ʿ� " + c + "��");
		}
		if(n>0) {
			System.out.println("�Ͽ� " + n + "��");
		}

	}

	

}
