package ch09;

public enum MyLayout {
	WEST("West"), EAST("East"), SOUTH("South"), NORTH("North"), CENTER("Center");

	private String value;

	private MyLayout(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
