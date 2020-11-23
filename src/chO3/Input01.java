package chO3;

import java.util.Scanner;

public class Input01 {
//메인 스레드
	public static void main(String[] args) {
		//Scanner -> I/O 장치에 접근가능
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 블락킹, 동기적 프로그래밍
		//이때 cpu동작 기다림상태
		System.out.println("입력받은 값 :" + num);

	}

}
