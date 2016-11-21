package ex7_2;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String tostring() {
		return "(" + x + "," + y + ")";
	}
}
