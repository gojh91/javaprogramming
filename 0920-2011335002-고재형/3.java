//2011335002
package java0920;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("\n숫자들의 합 : " + sum(new int[] { 1, 2, 3, 4 }));
	}

	public static int sum(int[] numbers) {
		int total = 0;
		for (int value : numbers)
			total = total + value;
		System.out.print("배열 값 = ");
		for (int value : numbers)
			System.out.print(value + " ");
		return total;
	}
}
