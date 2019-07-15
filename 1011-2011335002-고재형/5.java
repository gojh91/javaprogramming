//2011335002

package java1011;

class Point {
	private int x, y;

	public Point(int a, int b) {
		x = a;
		y = b;
	}

	public String toString() {
		return "[X=" + x + ",Y=" + y + "]";

	}
}

class Circle {
	private int radius;
	private Point center;

	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}

	public String toString() {
		return "반지름 : " + radius + "\n중심 : " + center;
	}
}

public class CircleTest {
	public static void main(String args[]) {
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		System.out.println(c);
	}
}
