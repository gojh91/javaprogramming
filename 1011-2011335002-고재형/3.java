//2011335002

package java1011;

class Rectangle{
	private int x,y;
	private int width,height;
	Rectangle(){
		this(0,0,1,1);
	}
	Rectangle(int width, int height){
		this(0,0,width, height);
	}
	Rectangle(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public String toString() {
		return "x=" + x +"\ny=" + y + "\nwidth="+ width +"\nheight=" +height +"\n";
	}
}

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle obj1=new Rectangle();
		Rectangle obj2=new Rectangle(40,30);
		Rectangle obj3=new Rectangle(10,10,40,30);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}

}
