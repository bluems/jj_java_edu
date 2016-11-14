package bonus1;

class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	public String toString() {
		return "(" + x + "," + y + ") ¹İÁö¸§ " + radius;
	}
	
	public boolean equals(Circle c) {
		if (radius == c.radius) return true;
		else return false;
	}
}
