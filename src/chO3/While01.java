package chO3;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 데몬 ( Daemon Process ) - 웹서버
		//끝없이 계속 도는 프로그램
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
