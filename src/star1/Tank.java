package star1;

class Tank extends StarUnit{
	//2. 초기화를 위한 생성자(마법 x)
	public Tank() {
			
	}
	public Tank(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
	//3. 디폴트 생성자를 직접 만들어 준다.
	//이유 : 컴파일러가 안만들어 주니까

}
