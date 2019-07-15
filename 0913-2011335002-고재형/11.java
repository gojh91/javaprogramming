//2011335002 고재형
package test;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		final int STUDENTS=5;
		float total=0;
		
		Scanner scan = new Scanner(System.in);
		
		float[] scores=new float[STUDENTS];
		for(int i=0; i<scores.length;i++) {
		System.out.print("성적을 입력하시오:");
		scores[i] = scan.nextFloat();		
		}
		
		for(int j=0;j<scores.length;j++)
			total += scores[j];
		
		System.out.printf("평균 성적:%.2f",total/STUDENTS);
	}
}
