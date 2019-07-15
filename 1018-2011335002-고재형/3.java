//2011335002
package java1018;

class Shape{
	protected int x,y;
	
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
	private static Shape shape_array[];
	public static void init() {
		shape_array=new Shape[3];
		shape_array[0]=new Circle();
		shape_array[1]=new Rectangle();
		shape_array[2]=new Triangle();
	}

	public static void drawAll() {
		for(int i=0;i<shape_array.length;i++)
			shape_array[i].draw();
	}
public static void main(String[] args) {
		init();
		drawAll();
	}
}

