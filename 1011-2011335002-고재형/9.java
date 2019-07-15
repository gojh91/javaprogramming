//2011335002

package java1011;

class Shape{
private int x;
private int y;

public Shape(int x, int y) {
	System.out.println("Shape()");
	this.x =x;
	this.y=y;
}
}

class Rectangle2 extends Shape{
	private int width;
	private int height;
	
	public Rectangle2(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("Rectangle()");
		this.width=width;
		this.height=height;
	}
	double calcArea() {
		return width*height;
	}
}


class ColoredRectangle extends Rectangle2{
	String color;
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);
		System.out.println("ColoredRectangle()");
		this.color=color;
	}
}


public class BankTest2 {
public static void main(String[] args) {
ColoredRectangle obj= new ColoredRectangle(10,10,20,20,"red");
}
}
