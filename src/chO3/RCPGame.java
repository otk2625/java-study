package chO3;

import java.util.Scanner;

public class RCPGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String cs = sc.next();
		System.out.print("���� >> ");
		String yh = sc.next();
		
		if(cs.equals("����")) {
			if(yh.equals(cs)) {
				System.out.println("�����ϴ�.");
			} else if(yh.equals("����")) {
				System.out.println("���� �̰���ϴ�");
			}
			else if(yh.equals("��")) {
				System.out.println("ö���� �̰���ϴ�");
			}
		}
		if(cs.equals("����")) {
			if(yh.equals(cs)) {
				System.out.println("�����ϴ�.");
			} else if(yh.equals("��")) {
				System.out.println("���� �̰���ϴ�");
			}
			else if(yh.equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
			}
		}
		if(cs.equals("��")) {
			if(yh.equals(cs)) {
				System.out.println("�����ϴ�.");
			} else if(yh.equals("����")) {
				System.out.println("���� �̰���ϴ�");
			}
			else if(yh.equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
			}
		}

	}

}
