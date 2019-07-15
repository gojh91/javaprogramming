//2011335002
package java0920;

//import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[] value = new int[SIZE];

		for (int i = 0; i < SIZE; i++)
			value[i] = ((int) (Math.random() * 6) + 1);

		for (int j = 0; j < SIZE; j++)
			System.out.println(value[j]);
		//System.out.println(Arrays.toString(value));
	}
}
