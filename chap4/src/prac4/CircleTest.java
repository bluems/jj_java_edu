package prac4;

class Circle {
	private double radius;
	static final double PI = 3.141592;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	private double square ( double value ) {
		return value*value;
	}
	
	public double getArea() {
		return square(radius)*PI;
	}
	
	public double getPerimeter() {
		return 2.0*PI*radius;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		
		System.out.println("원의 면적은?" + c.getArea());
		
		System.out.println("원의 둘레는?" + c.getPerimeter());

	}

}
