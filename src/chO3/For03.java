package chO3;

import java.util.Vector;

public class For03 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Vector<String> vs = new Vector<>();
		vs.add("�̰� ���ô簡");
		vs.add("���� ����");
		
		System.out.println(vs.get(0) + vs.get(1));

	}

}
