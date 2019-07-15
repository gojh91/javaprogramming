//2011335002
package java1115;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("양수 입력:");
		int num = input.nextInt();
		assert (num > 0) : "0보다 큰 수를 입력하시오!";
	}
}


