package chO3;

public class Array01 {

	public static void main(String[] args) {
		// 같은 종류의 데이터들이 순차적으로 저장된다
		// 장점 : 엑세스가 빠름
		// 단점 : 배열의 크기를 늘리거나 줄일 수 없음.
		int[] n = new int[3];
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		n[0] = 50;
		System.out.println(n[0]);
//		n[3] = 2; ArrayOutOfBoundException예외
//		System.out.println(n[3]);

	}

}
