import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		double radius, area;
		
		System.out.println("반지름을 입력하시오 : ");
		radius=input.nextDouble();

		area = 3.141592 * radius * radius;

		System.out.println("원의 면적 : " + area);
	}

}
