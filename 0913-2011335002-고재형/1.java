package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int x, y, max;

		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ�:");
		x = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�:");
		y = input.nextInt();
		
		if (x>y) {
			max=x;
		} else {
			max=y;
		}
		System.out.println("ū ���� "+ max);
	}
}
