package ex6_4;

class Rect {
	int width, height;
	public Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public boolean equals(Rect p) {
		if (width*height == p.width*p.height) return true;
		else return false;
	}
}
