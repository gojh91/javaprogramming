//2011335002 ������
package test;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		int x,y,r;
		
		System.out.print("�ΰ��� ���� �Է�(ū��,������):");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		do {
			if(y == 0)break;
			r=x%y;
			x=y;
			y=r;
		}while(y!=0);
			System.out.println("�ִ� ����� = "+x);
	}
}
