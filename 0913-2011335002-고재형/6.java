//2011335002 ������
package test;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int num;
		int i=1;
		
		System.out.print("����ϰ� ���� ����?");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		while(i<=9) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
	}
}
