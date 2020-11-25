package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash02 {

	public static void main(String[] args) {
		//랜덤으로 숫자생성하는 클래스
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>(); //중복된 데이터 x
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(lotto.size() == 6) {
				break;
			}
			lotto.add(n);
		}
		
		Iterator<Integer> it = lotto.iterator();

		while(it.hasNext()) { //값이 있으면 true, 없으면 false
			System.out.print(it.next() + " "); //현재 인덱스의 값을 리턴 + 인덱스증가
		}
	}

}
