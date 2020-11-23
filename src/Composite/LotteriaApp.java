package Composite;

public class LotteriaApp {

	public static void main(String[] args) {
		Burger b1 = new Burger();
		Potato p1 = new Potato();
		Coke c1 = new Coke();
		
		System.out.println();
		BurgerSet bs = new BurgerSet();
		
		System.out.println();
		BigBurger bbg1 = new BigBurger();
		
		System.out.println();
		SirmpBurger sb = new SirmpBurger();
		
		System.out.println();
		SirmpBurgerSet sbs = new SirmpBurgerSet();

	}

}
