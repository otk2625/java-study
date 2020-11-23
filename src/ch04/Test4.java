package ch04;

class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	boolean contains(Rectangle r) {
		if(this.x < r.x && this.y < r.y && this.square() > r.square()) {
			return true;
		}
		else
			return false;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");

	}

}
