package Composite;
import lombok.*;

@Data //getter setter
public class Coke {
	private int price;
	private String desc;
	
	public Coke() {
		this(1000, "����");
	}
	
	public Coke(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"�� ����������ϴ�.");
	}
	
	
	
}
