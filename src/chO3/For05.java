package chO3;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			if(i % 3 == 0)
				sum += i;
			else
				continue;
		}
		System.out.println("3의 배수의 합 : " + sum);
		
		sc.close();

	}

}
