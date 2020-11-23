package star1;

//1. 질럿과 드라군 탱크 scv 닥템 => StarUnit타입

public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName() +" -> "+ u2.getName() +" 공격");
		u2.setHp(u2.getHp() - u1.getAttack()); //90
		System.out.println(u2.getName() +" 체력 : " + u2.getHp());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Zealot z1 = new Zealot/*heap공간*/("질럿1",100 ,10); 
		Dragon d1 = new Dragon("드라군1", 100, 20); //new 했을때 heap
		//z1,d1은 main이 들고있는 지역변수(stack)
		Dragon d2 = new Dragon("드라군2", 100, 20);
		StarUnit dt1 = new Darktempler("다크템플러1", 100, 50);
		StarUnit dt2 = new Darktempler("다크템플러2", 100, 50);
		
		//1. 질럿1 -> 드라군1 공격
		attack(z1,d1);
		
		//2. 드라군1 -> 질럿1 공격
		attack(d1,z1);
		
		//3. 드라군1 -> 드라군2 공격
		attack(d1, d2);
		
		//4. 다크템플러1 -> 질럿1 공격(닥템1, 100, 50)
		attack(dt1 , z1);
		
		//5. 다크템플러2 -> 드라군1 공격
		attack(dt2 , d1);
	}

}
