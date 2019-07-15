package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		final int targetSales=1000;
		int mySales;
		int bonus;
		String result;

		Scanner input = new Scanner(System.in);
		System.out.print("실적 입력(단위:만원):");
		mySales = input.nextInt();
		
		
		if (mySales>=1000) {
			result="실적 당설!";
			bonus=(mySales-targetSales)/10;
		} else {
			result="실적 당설 못함!";
			bonus=0;
		}
		System.out.println(result+"\n"+"보너스:"+bonus);
	}
}
