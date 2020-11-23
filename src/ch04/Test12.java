package ch04;

import java.util.Scanner;

class consert {
	String name;
	int type;
	int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	void typeshow(int t) {
		if(t == 1) {
			System.out.println();
		}
	}
	
}
public class Test12 {

	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		int n = 0; int sittype = 0; String name; int number=0;
		String[] s = new String[10];
		String[] a = new String[10];
		String[] b = new String[10];
		consert[] c1 = new consert[30]; 
		int count = 0;
		for(int i =0; i< 10; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			n = sc.nextInt();
			
			if(n == 1) {
				c1[count] = new consert(); 
				System.out.print("좌석구분 S(1), A(2), B(3) >>");
				sittype = sc.nextInt();
				c1[count].setType(sittype);
				if(sittype == 1) {
					System.out.print("S>> ");
					for(int i =0; i< 10; i++) {
						System.out.print(s[i]+" ");
					}
					System.out.println("");
				}
				else if(sittype == 2) {
					System.out.print("A>> ");
					for(int i =0; i< 10; i++) {
						
						System.out.print(a[i]+" ");
					}
					System.out.println("");
				}
				else if(sittype == 3) {
					System.out.print("B>> ");
					for(int i =0; i< 10; i++) {
						
						System.out.print(b[i]+" ");
					}
					System.out.println("");
				}
				else 
					System.out.println("잘못된 번호");

				System.out.print("이름>>");
				name = sc.next();
				c1[count].setName(name);
				
				System.out.print("번호>>");
				number = sc.nextInt();
				c1[count].setNumber(number);
				
				s[c1[count].getNumber() - 1] = c1[count].getName();
				count++;
			}
			else if(n == 2) {
				System.out.print("S>> ");
				for(int i =0; i< 10; i++) {
					
					System.out.print(s[i]+" ");
					
				}
				System.out.println();
				System.out.print("A>> ");
				for(int i =0; i< 10; i++) {
					
					System.out.print(a[i]+" ");
					
				}
				System.out.println();
				System.out.print("B>> ");
				for(int i =0; i< 10; i++) {
					
					System.out.print(b[i]+" ");
					
				}
				System.out.println();
			}
			else if(n == 3) {
				int search = 0; String searchName;
				System.out.print("좌석 S:1, A:2, B:3 >>");
				if(search == 1) {
					for(int i =0; i< 10; i++) {
						System.out.print("S>> ");
						System.out.println(s[i]+" ");
					}
					System.out.println("");
				}
				else if(search == 2) {
					for(int i =0; i< 10; i++) {
						System.out.print("A>> ");
						System.out.println(a[i]+" ");
					}
					System.out.println("");
				}
				else if(search == 3) {
					for(int i =0; i< 10; i++) {
						System.out.print("B>> ");
						System.out.println(b[i]+" ");
					}
					System.out.println("");
				}
				else 
					System.out.println("잘못된 번호");
				
				System.out.print("이름>>");
				searchName = sc.next();
				
				
			}
			else if(n == 4) {
				break;
			}
			else
				System.out.println("없는 메뉴");
			
		}

	}

}
