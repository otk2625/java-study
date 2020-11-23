package review;

public class Ex05 {

	public static void main(String[] args) {
		//배열 : 연속된 데이터공간을 확보해주기 때문에 엑세스가 굉장히빠름.
		//단점 : 배열은 데이터추가, 삭제가 안됨.
		//특징 : 같은 타입의 여러 데이터를 저장하는 자료형
		//Object 타입으로 만들면 모든 타입이 가능
		//상속을 통해서 부모타입으로 묶으면 모든타입이 다 가능.
		
		//배열은 크기가 정해져 있어야 함.
		//컬렉션을 사용할 예정 (ArrayList) - 제네릭을 알아야 사용가능.
		
		int[] n1 = new int[3];
		n1[0] = 1;
		n1[1] = 2;
		n1[2] = 3;
		System.out.println(n1[2]);
		
		Object[] n2 = new Object[3];
		// Wrraper클래스
		n2[0] = 2; // Integer
		n2[1] = "가나다"; // String
		n2[2] = 15.2; // Double

	}

}
