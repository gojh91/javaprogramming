//2011335002
package java1011;

import java.util.Scanner;

class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public int getVolume() {
		return volume;
	}
	
	Box(int w, int l, int h){
		width=w;
		length=l;
		height=h;
		volume=width*length*height;
	}
}

public class BoxTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("상자의 가로 세로 높이 입력:");
		int width=input.nextInt();
		int length=input.nextInt();
		int height=input.nextInt();
		
		Box b;
		
		b = new Box(width, length, height);
		System.out.println("상자의 부피=" + b.getVolume());
	}
}
