//2011335002
package java1018;

class Shape{
	private int x,y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Rectangle extends Shape{
	private int width,height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
	Shape s1,s2,s3,s4;
	s1=new Shape();
	s2=new Circle();
	s3=new Rectangle();
	s4=new Triangle();
	s1.draw();
	s2.draw();
	s3.draw();
	s4.draw();

	}

}
