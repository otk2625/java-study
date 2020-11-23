package chO3;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] a = new int[3];
		
		System.out.print("정수 3개 입력>>");
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		if((a[0] < a[1] && a[1] < a[2]) || (a[2] < a[1] && a[1] < a[0])) {
			System.out.println("중간 값은 " + a[1]);
		} else if((a[1] < a[0] && a[0] < a[2]) || (a[2] < a[0] && a[0] < a[1])) {
			System.out.println("중간 값은 " + a[0]);
		} else if((a[0] < a[2] && a[2] < a[1]) || (a[1] < a[2] && a[2] < a[0])) {
			System.out.println("중간 값은 " + a[2]);
		}
		
		
	}

}
