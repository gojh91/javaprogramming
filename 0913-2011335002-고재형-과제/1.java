//2011335002 ������
package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String w;
		int count=0;

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�����Է� : ");
			w = scan.next();
			
			if('w'>='a' && 'w'<='z')
				count++;
			else if('w' == '.') 
				break;
			else continue;
				
		}while(true);
		

		System.out.println("�ҹ��� ���� = " + count + "��" );
	}
}
