//2011335002 ������
package test;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String month;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸� �Է� : ");
		month = scan.next();
		
		int monthNumber;
		switch (month) {
		case "january":
			monthNumber=1;
			break;
		case "febuary":
			monthNumber=2;
			break;
		case "march":
			monthNumber=3;
			break;
		default:
			monthNumber=0;
			break;
		}
		System.out.println(monthNumber);
	}
}
