//2011335002
package java1011;

import java.util.Scanner;

class Box {
	int width;
	int length;
	int height;

	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}

	public boolean isSameBox(Box obj1, Box obj2){ 
		
		int volume1=obj1.width*obj1.length*obj1.height;
		int volume2=obj2.width*obj2.length*obj2.height;
		if(volume1==volume2) {
			return true;
		}
		return false;
	}
}

public class BoxTest {
	public static void main(String args[]) {		
		Scanner input = new Scanner(System.in);
		System.out.println("상자의 가로 세로 높이 입력:");
		int width=input.nextInt();
		int length=input.nextInt();
		int height=input.nextInt();
		Box obj1 = new Box(width, length, height);
		
		System.out.println("상자의 가로 세로 높이 입력:");
		int width2=input.nextInt();
		int length2=input.nextInt();
		int height2=input.nextInt();
		Box obj2 = new Box(width2, length2, height2);

		
		if(obj1.isSameBox(obj1, obj2) == true)
		{
			System.out.println("동일함");
		}else {
			System.out.println("다름");
		}
	}
}
