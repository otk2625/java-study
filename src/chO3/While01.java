package chO3;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� ( Daemon Process ) - ������
		//������ ��� ���� ���α׷�
		int check = 0;
		while (check >= 0) {
			int num = sc.nextInt();
			check = num;
			if (num < 0) {
				//break;
			}
		}

	}

}
