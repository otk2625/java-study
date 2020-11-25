package coffee;

//고객
//책임 : 주문(), 먹기()
public class Customer {
	
	public void order(Baristar b) {
		//바리스타에게 메시지를 보냄
		Coffee c = b.makeCoffee();
		System.out.println(c.getName() + "가 나왔습니다");
		this.eat(c);
	}
	public void eat(Coffee c) {
		System.out.println(c.getName() + "를 먹습니다");
	}
}
