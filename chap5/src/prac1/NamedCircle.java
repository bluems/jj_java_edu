package prac1;

class Circle {
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
}

public class NamedCircle extends Circle {
	private String name;
	NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	void show() {
		System.out.println(name + ", ¹ÝÁö¸§ = " + getRadius());
	}
	

	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		NamedCircle p = new NamedCircle(30, "Pizza");
		w.show();
		p.show();

	}

}
