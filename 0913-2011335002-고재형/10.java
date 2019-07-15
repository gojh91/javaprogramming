//2011335002 고재형
package test;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		String s = "no news is good news";
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'n')
				continue;
			num++;
		}
		System.out.println("문장 내 n의 개수 = " + num);
	}
}
