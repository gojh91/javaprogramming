package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		final int targetSales=1000;
		int mySales;
		int bonus;
		String result;

		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�(����:����):");
		mySales = input.nextInt();
		
		
		if (mySales>=1000) {
			result="���� �缳!";
			bonus=(mySales-targetSales)/10;
		} else {
			result="���� �缳 ����!";
			bonus=0;
		}
		System.out.println(result+"\n"+"���ʽ�:"+bonus);
	}
}
