//2011335002 ������
package test;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int sum=0;
		
		System.out.print("������ ����?");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i=0;i<count;i++) {
		int number=(int)(Math.random()*100);
		System.out.println("���� : "+ number);
		sum += number;
		}
		System.out.println("����"+ count +"���� �� = " + sum);
	}
}
