package review;

public class Ex08 {
	//void 리턴이 없다. add는 변수이름 ()는 함수라는 뜻
	//int a, b => 매개변수(arguments)
	void add(int a,int b) {
		System.out.println(a+b);
	}
	int minus(int n1, int n2) {
		return n1-n2; //함수를 호출한 문장의 값이 n1-n2로 변경됨.
	}
	public static void main(String[] args) {
		
		Ex08 e = new Ex08();
		// 1,2 를 인수라고 부름.
		e.add(1, 2); //함수의 호출(13번 라인에서 7번라인 점프 후 다시 13번 라인으로 돌아옴)
		
		int result = e.minus(10, 5);
		System.out.println(result);
	}

}
