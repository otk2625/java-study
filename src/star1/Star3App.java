package star1;

//1. ������ ��� ��ũ scv ���� => StarUnitŸ��

public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName() +" -> "+ u2.getName() +" ����");
		u2.setHp(u2.getHp() - u1.getAttack()); //90
		System.out.println(u2.getName() +" ü�� : " + u2.getHp());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Zealot z1 = new Zealot/*heap����*/("����1",100 ,10); 
		Dragon d1 = new Dragon("���1", 100, 20); //new ������ heap
		//z1,d1�� main�� ����ִ� ��������(stack)
		Dragon d2 = new Dragon("���2", 100, 20);
		StarUnit dt1 = new Darktempler("��ũ���÷�1", 100, 50);
		StarUnit dt2 = new Darktempler("��ũ���÷�2", 100, 50);
		
		//1. ����1 -> ���1 ����
		attack(z1,d1);
		
		//2. ���1 -> ����1 ����
		attack(d1,z1);
		
		//3. ���1 -> ���2 ����
		attack(d1, d2);
		
		//4. ��ũ���÷�1 -> ����1 ����(����1, 100, 50)
		attack(dt1 , z1);
		
		//5. ��ũ���÷�2 -> ���1 ����
		attack(dt2 , d1);
	}

}
