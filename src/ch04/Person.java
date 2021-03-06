package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	public Person() { 
		//디폴트 생성자는 생성자가 하나도 없으면 컴파일러가 자동으로 만듦
		//만약 생성자가 있으면 디폴트 생성자를 만들어 주지 않음.
		//이 경우에는 디폴트 생성자를 직접 만들어 줘야 함. (오버로딩, 타입 개수가 다름)
	}
	//초기화를 위한 생성자 , 초기화를 위한 함수 return불가
	public Person(String n, String j, int a, char g, String b) { 
		System.out.println("사람이 태어남");
		name = n;
		job = j;
		age = a;
		gender = g;
		blood = b;
	}
	
	void preview() {
		System.out.println("===="+name+"====");
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("혈액형 : " + blood);
		System.out.println();
	}
}
