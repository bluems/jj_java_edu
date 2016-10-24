package prac4_5;
class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return this.radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class CircleManager {
	static void copy( Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	
	static boolean equals (Circle a, Circle b) {
		if( a.getRadius() == b.getRadius()) {
			return true;
		}
		else return false;
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		Circle waffle = new Circle(5);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if (res == true)
			System.out.println("pizza equal waffle");
		else
			System.out.println("pizza not equal waffle");
		
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza, waffle);
		if (res == true)
			System.out.println("pizza equal waffle");
		else
			System.out.println("pizza not equal waffle");
	}

}
