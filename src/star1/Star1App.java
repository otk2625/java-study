//package star1;
//
////�����ε� : �Լ��� �̸��� ���Ƶ� �Ű������� ����, Ÿ���� �ٸ���
////�ٸ� �Լ��� �ν��Ѵ�.(������)
//public class Star1App {
//	
//	//����1 -> ���1
//	static void attack(Zealot u1, Dragon u2) { //u1,u2�� attack�� ����ִ� ��������
//		System.out.println(u1.name +" -> "+ u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü�� : " + u2.hp);
//		System.out.println();
//	}
//	
//	//���1 -> ����1
//	static void attack(Dragon u1, Zealot u2) { //u1,u2�� attack�� ����ִ� ��������
//		System.out.println(u1.name +" -> "+ u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü�� : " + u2.hp);
//		System.out.println();
//	}
//	
//	// ���1 -> ���2
//	static void attack(Dragon u1, Dragon u2) { //u1,u2�� attack�� ����ִ� ��������
//		System.out.println(u1.name +" -> "+ u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü�� : " + u2.hp);
//		System.out.println();
//	}
//	// ��ũ���÷�1 -> ���1
//	static void attack(Darktempler u1, Dragon u2) { //u1,u2�� attack�� ����ִ� ��������
//		System.out.println(u1.name +" -> "+ u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü�� : " + u2.hp);
//		System.out.println();
//	}
//		// ��ũ���÷�2 -> ����2
//	static void attack(Darktempler u1, Zealot u2) { //u1,u2�� attack�� ����ִ� ��������
//		System.out.println(u1.name +" -> "+ u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü�� : " + u2.hp);
//		System.out.println();
//	}
//	public static void main(String[] args) {
//		Zealot z1 = new Zealot/*heap����*/("����1",100 ,10); 
//		Dragon d1 = new Dragon("���1", 100, 20); //new ������ heap
//		//z1,d1�� main�� ����ִ� ��������(stack)
//		Dragon d2 = new Dragon("���2", 100, 20);
//		Darktempler dt1 = new Darktempler("��ũ���÷�1", 100, 50);
//		Darktempler dt2 = new Darktempler("��ũ���÷�2", 100, 50);
//		
//		//1. ����1 -> ���1 ����
//		attack(z1,d1);
//		
//		//2. ���1 -> ����1 ����
//		attack(d1,z1);
//		
//		//3. ���1 -> ���2 ����
//		attack(d1, d2);
//		
//		//4. ��ũ���÷�1 -> ����1 ����(����1, 100, 50)
//		attack(dt1 , z1);
//		
//		//5. ��ũ���÷�2 -> ���1 ����
//		attack(dt2 , d1);
//	}
//
//}
