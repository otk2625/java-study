package chO3;

public class For04 {

	public static void main(String[] args) {
		System.out.println("1. ");
		for (int i = 0; i < 5; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n2. ");
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i = 0; i < 2; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("\n2. ");
		for (int i = 0; i < 3; i++) {
			if(i % 2 == 0) {
				System.out.print(" ");
				System.out.print("*");
			}
			else {
				System.out.print("***");
			}
			System.out.println();

		}

	}

}
