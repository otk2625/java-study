package chO3;

import java.util.*;

public class Test3_16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" };
		String rcp = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");
			rcp = sc.next();
			int n = (int) (Math.random() * 3);
			if (rcp.equals("가위")) {
				if (str[n].equals("바위")) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 컴퓨터가 이겼습니다");
				} else if(str[n].equals("보")) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 사용자가 이겼습니다");
				} else if (rcp.equals(str[n])) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 비겼습니다");
				}
			} else if (rcp.equals("바위")) {
				if (str[n].equals("보")) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 컴퓨터가 이겼습니다");
				} else if (str[n].equals("가위")) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 사용자가 이겼습니다");
				} else if (rcp.equals(str[n])) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 비겼습니다");
				}
			} else if (rcp.equals("보")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 컴퓨터가 이겼습니다");
				} else if (str[n].equals("바위")){
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 사용자가 이겼습니다");
				} else if (rcp.equals(str[n])) {
					System.out.println("사용자 :" + rcp + ", 컴퓨터 :" + str[n] + ", 비겼습니다");
				}
			} else if (rcp.equals("그만")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}
		System.out.println("게임을 종료합니다...ㄱ");

	}

}
