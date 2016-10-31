package prac4;
class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {
	private String name;
	ColorPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	void setPoint(int x, int y) {
		move(x, y);
	}
	
	void setColor(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println(name + "»öÀ¸·Î(" + getX() + "," + getY() + ")");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

	}

}
