package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {
	public static void main(String[] args) {
		//랜덤으로 숫자생성하는 클래스
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>(); //중복된 데이터 x
		//이전번지에 같은 값이 있으면 중복된 데이터 넣지않기
		while(true) {
			int n = r.nextInt(45)+1;
			int c = 0;
			boolean isSame = false;
			if(lotto.size() == 6) {
				break;
			}
			//이전번지 확인 후 같은 값이 없을때만 add	
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

		while(it.hasNext()) { //값이 있으면 true, 없으면 false
			System.out.print(it.next() + " "); //현재 인덱스의 값을 리턴 + 인덱스증가
		}
	}

}
