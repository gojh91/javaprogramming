//2011335002
package java1011;

import java.util.Scanner;

class Box {
	int width;
	int length;
	int height;
	int volume;
	
	Box(int w, int l, int h){
		width=w;
		length=l;
		height=h;
		volume=width*length*height;
	}
	Box whosLargest(Box box1, Box box2) {
		if(box1.volume>box2.volume)
			return box1;
		else
			return box2;
	}
}


public class BoxTest {
	public static void main(String args[]) {
		Box obj1= new Box(10,20,50);
		Box obj2= new Box(10,30,30);
		
		Box largest=obj1.whosLargest(obj1, obj2);
		System.out.println("(" + largest.width+","+largest.length+","+largest.height+")");
		System.out.println("ũ��"+largest.volume);
	}
}
