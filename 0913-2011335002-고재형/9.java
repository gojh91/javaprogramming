//2011335002 ������
package test;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		double total=0;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("����?");
		int grade = scan.nextInt();
		
		if(grade<0)
			break;
		
		total += grade;
		count++;
		}
		System.out.println("��� = " + total/count);
	}
}
