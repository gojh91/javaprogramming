import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		double radius, area;
		
		System.out.println("�������� �Է��Ͻÿ� : ");
		radius=input.nextDouble();

		area = 3.141592 * radius * radius;

		System.out.println("���� ���� : " + area);
	}

}
