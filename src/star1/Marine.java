package star1;

class Marine {
	//��� �ʵ� Ȥ�� ������Ƽ�� private�� �����.
	private String name;
	private int hp;
	private int attack;
	//this�� heap���� , new�� �� heap������ ���ε�
	public Marine(String name, int hp, int attack) {
		this.name = name; //this�� heap����
		this.attack = attack;
	}
	
	
	public Marine() {
		// TODO Auto-generated constructor stub
	}
	
}
