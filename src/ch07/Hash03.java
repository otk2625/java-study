package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {
	public static void main(String[] args) {
		//�������� ���ڻ����ϴ� Ŭ����
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>(); //�ߺ��� ������ x
		//���������� ���� ���� ������ �ߺ��� ������ �����ʱ�
		while(true) {
			int n = r.nextInt(45)+1;
			int c = 0;
			boolean isSame = false;
			if(lotto.size() == 6) {
				break;
			}
			//�������� Ȯ�� �� ���� ���� �������� add	
			for (int i = 0; i < lotto.size(); i++) {
				if(lotto.get(i) == n) {
					isSame = true;
				}
			}
			
			if(isSame == false) {
				lotto.add(n);
			}	
		}
		
		Iterator<Integer> it = lotto.iterator();

		while(it.hasNext()) { //���� ������ true, ������ false
			System.out.print(it.next() + " "); //���� �ε����� ���� ���� + �ε�������
		}
	}

}
