package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash02 {

	public static void main(String[] args) {
		//�������� ���ڻ����ϴ� Ŭ����
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>(); //�ߺ��� ������ x
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(lotto.size() == 6) {
				break;
			}
			lotto.add(n);
		}
		
		Iterator<Integer> it = lotto.iterator();

		while(it.hasNext()) { //���� ������ true, ������ false
			System.out.print(it.next() + " "); //���� �ε����� ���� ���� + �ε�������
		}
	}

}
