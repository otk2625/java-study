package chO3;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = sc.nextInt();
		if(n >= 10) {
			if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
				System.out.print("�ڼ� ¦");
				n /= 10;
			}
		}
		if(n == 3 || n == 6 || n == 9) {
			System.out.println("¦");
		}

	}

}
