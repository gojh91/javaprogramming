//2011335002 고재형
package test;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		int x,y,r;
		
		System.out.print("두개의 정수 입력(큰수,작은수):");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		do {
			if(y == 0)break;
			r=x%y;
			x=y;
			y=r;
		}while(y!=0);
			System.out.println("최대 공약수 = "+x);
	}
}
