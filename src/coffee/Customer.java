package coffee;

//��
//å�� : �ֹ�(), �Ա�()
public class Customer {
	
	public void order(Baristar b) {
		//�ٸ���Ÿ���� �޽����� ����
		Coffee c = b.makeCoffee();
		System.out.println(c.getName() + "�� ���Խ��ϴ�");
		this.eat(c);
	}
	public void eat(Coffee c) {
		System.out.println(c.getName() + "�� �Խ��ϴ�");
	}
}
