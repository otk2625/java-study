package coffee;

public class CoffeeApp {

	public static void main(String[] args) {
		Baristar b1 = new Baristar();
		Customer c1 = new Customer();
		
		//°í°´ => ¹Ù¸®½ºÅ¸ Çù·Â
		c1.order(b1);
	}

}
