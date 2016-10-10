package ex4_1;

public class ex4_1 {
	
	public static class Circle {
		int radius;
		String name;
		
		public double getArea() {
			return 3.14*radius*radius;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dounut;
		dounut = new Circle();
		dounut.radius = 10;
		dounut.name = "자바도넛";
		
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적은 " + area);
	}
}
