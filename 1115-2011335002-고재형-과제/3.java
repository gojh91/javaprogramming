//2011335002
package Test;

public class Test {
	static void prn() throws NumberFormatException{
		int num = Integer.parseInt("ABC");	
		System.out.println(num);
	}
	public static void main(String args[]) {
		try {
			prn();

		} catch (NumberFormatException e) {
			System.out.println("정수 입력 오류 발생!");
		}
	}
}
