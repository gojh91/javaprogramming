//2011335002
package Test;

public class Test {
	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);

		} catch (NumberFormatException e) {
			System.out.println("���� �Է� ���� �߻�!");
		}
	}
}
