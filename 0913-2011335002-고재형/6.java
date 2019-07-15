//2011335002 고재형
package test;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int num;
		int i=1;
		
		System.out.print("출력하고 싶은 단은?");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		while(i<=9) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
	}
}
