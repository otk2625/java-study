package Composite;

public class SirmpBurgerSet {
	private SirmpBurger burger;
	private Potato potato;
	private Coke coke;
	
	public SirmpBurgerSet() {
		this(new SirmpBurger(),
				new Potato(),
				new Coke());
	}
	
	public SirmpBurgerSet(SirmpBurger burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
}
