package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "홍길동"; //최조 엑세스 : 주소
		String str2 = "홍길동"; // 엑세스 : 값
		
		// == 은 최초의 엑세스한 메모리 공간의 내용을 비교
		System.out.println(str1 == str2);//true
		
		//String의 Hash함수는 오버라이딩 되서
		//같은 문자열이면 같은 해쉬를 뽑아낸다.
		String str3 = "임꺽정"; //Heap내부의 Constant Pool
		String str4 = new String("임꺽정");//Heap내부의 String영역
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3 == str4);//false 참조변수의 주소가 달라서
		
		//equals()는  ==으로 먼저 비교, 같으면 true
		//==으로 비교했는데 false가 나오면 최종목적지 값을 비교
		//일반적인 것들은 ==으로 비교, 문자열은equals()사용!
		System.out.println(str3.equals(str4));
	
		
	}
}
