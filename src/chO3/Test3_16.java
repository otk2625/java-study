package chO3;

import java.util.*;

public class Test3_16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str[] = { "����", "����", "��" };
		String rcp = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");
			rcp = sc.next();
			int n = (int) (Math.random() * 3);
			if (rcp.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�");
				} else if(str[n].equals("��")) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ����ڰ� �̰���ϴ�");
				} else if (rcp.equals(str[n])) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", �����ϴ�");
				}
			} else if (rcp.equals("����")) {
				if (str[n].equals("��")) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�");
				} else if (str[n].equals("����")) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ����ڰ� �̰���ϴ�");
				} else if (rcp.equals(str[n])) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", �����ϴ�");
				}
			} else if (rcp.equals("��")) {
				if (str[n].equals("����")) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�");
				} else if (str[n].equals("����")){
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", ����ڰ� �̰���ϴ�");
				} else if (rcp.equals(str[n])) {
					System.out.println("����� :" + rcp + ", ��ǻ�� :" + str[n] + ", �����ϴ�");
				}
			} else if (rcp.equals("�׸�")) {
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
		System.out.println("������ �����մϴ�...��");

	}

}
