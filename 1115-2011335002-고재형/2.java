//2011335002
package java1115;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {
	static void prn(int i, int j) throws Exception{
			System.out.println(i / j);
	}
	

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수:");
		int i = s.nextInt();
		System.out.println("두 번째 수:");
		int j = s.nextInt();
		
		try {
			prn(i, j);
		} catch (Exception e) {
			System.out.println("0으로 나누기 오류 발생");
		}
	}
}
