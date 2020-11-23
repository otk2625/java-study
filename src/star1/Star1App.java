//package star1;
//
////오버로딩 : 함수의 이름이 같아도 매개변수의 개수, 타입이 다르면
////다른 함수로 인식한다.(과적재)
//public class Star1App {
//	
//	//질럿1 -> 드라군1
//	static void attack(Zealot u1, Dragon u2) { //u1,u2는 attack이 들고있는 지역변수
//		System.out.println(u1.name +" -> "+ u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력 : " + u2.hp);
//		System.out.println();
//	}
//	
//	//드라군1 -> 질럿1
//	static void attack(Dragon u1, Zealot u2) { //u1,u2는 attack이 들고있는 지역변수
//		System.out.println(u1.name +" -> "+ u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력 : " + u2.hp);
//		System.out.println();
//	}
//	
//	// 드라군1 -> 드라군2
//	static void attack(Dragon u1, Dragon u2) { //u1,u2는 attack이 들고있는 지역변수
//		System.out.println(u1.name +" -> "+ u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력 : " + u2.hp);
//		System.out.println();
//	}
//	// 다크템플러1 -> 드라군1
//	static void attack(Darktempler u1, Dragon u2) { //u1,u2는 attack이 들고있는 지역변수
//		System.out.println(u1.name +" -> "+ u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력 : " + u2.hp);
//		System.out.println();
//	}
//		// 다크템플러2 -> 질럿2
//	static void attack(Darktempler u1, Zealot u2) { //u1,u2는 attack이 들고있는 지역변수
//		System.out.println(u1.name +" -> "+ u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력 : " + u2.hp);
//		System.out.println();
//	}
//	public static void main(String[] args) {
//		Zealot z1 = new Zealot/*heap공간*/("질럿1",100 ,10); 
//		Dragon d1 = new Dragon("드라군1", 100, 20); //new 했을때 heap
//		//z1,d1은 main이 들고있는 지역변수(stack)
//		Dragon d2 = new Dragon("드라군2", 100, 20);
//		Darktempler dt1 = new Darktempler("다크템플러1", 100, 50);
//		Darktempler dt2 = new Darktempler("다크템플러2", 100, 50);
//		
//		//1. 질럿1 -> 드라군1 공격
//		attack(z1,d1);
//		
//		//2. 드라군1 -> 질럿1 공격
//		attack(d1,z1);
//		
//		//3. 드라군1 -> 드라군2 공격
//		attack(d1, d2);
//		
//		//4. 다크템플러1 -> 질럿1 공격(닥템1, 100, 50)
//		attack(dt1 , z1);
//		
//		//5. 다크템플러2 -> 드라군1 공격
//		attack(dt2 , d1);
//	}
//
//}
