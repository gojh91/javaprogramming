//2011335002
package java1115;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {
	static void prn(int i, int j) {
		try {
			System.out.println(i / j);
		} catch (Exception e) {
			System.out.println("0���� ������ ���� �߻�");
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ��:");
		int i = s.nextInt();
		System.out.println("�� ��° ��:");
		int j = s.nextInt();
		prn(i, j);
	}
}
