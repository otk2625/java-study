package ch02;

public class Var01 {
	//자바는 .class파일을 실행하면 static부분을 메모리에 로드한다.(static공간)
	//static공간에 있는 main()함수를 찾아서 호출하고
	//이때 stack이 생성 되는데 이 stack의 이름은 main이라고 한다
	//main에 stack종료(end of main)되면 프로그램 종료
	public static void main(String[] args) {
		//code부분
		System.out.println("첫번째");
		System.out.println("두번째");
		
	}//end of main
}
