//2011335002 ������
package test;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		final int STUDENTS=5;
		float total=0;
		
		Scanner scan = new Scanner(System.in);
		
		float[] scores=new float[STUDENTS];
		for(int i=0; i<scores.length;i++) {
		System.out.print("������ �Է��Ͻÿ�:");
		scores[i] = scan.nextFloat();		
		}
		
		for(int j=0;j<scores.length;j++)
			total += scores[j];
		
		System.out.printf("��� ����:%.2f",total/STUDENTS);
	}
}
