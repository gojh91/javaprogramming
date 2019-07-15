//2011335002
package java0920;

import java.util.Scanner;

public class MyCounterTest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("¼³Á¤ °ª? : ");
		int value = input.nextInt();
		MyCounter obj=new MyCounter(value);
		System.out.println("counter = " + obj.counter);
	}
}
