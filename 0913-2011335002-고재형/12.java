//2011335002 고재형
package test;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		int s[]= {120,30,90,60,180,80,112,40,100,78};
		int minimum;
		
		minimum=s[0];
		
		for(int i=1; i<s.length;i++)
			if(s[i]<minimum)
				minimum=s[i];
		System.out.print("배열 값 = ");
		for(int j=0;j<s.length;j++)
			System.out.print(s[j]+" ");
		System.out.println("\n최소값 = " + minimum);
	}
}
