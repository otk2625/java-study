package star1;

class Marine {
	//모든 필드 혹은 프로퍼티는 private로 만든다.
	private String name;
	private int hp;
	private int attack;
	//this는 heap변수 , new가 된 heap공간을 바인딩
	public Marine(String name, int hp, int attack) {
		this.name = name; //this는 heap변수
		this.attack = attack;
	}
	
	
	public Marine() {
		// TODO Auto-generated constructor stub
	}
	
}
