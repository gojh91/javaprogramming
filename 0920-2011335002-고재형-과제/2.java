//2011335002
package java0920;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();

		Scanner input = new Scanner(System.in);

		System.out.print("���� �Է�(1-3) : ");
		int a = input.nextInt();
		myCar.changeColor(a);

		System.out.print("\n��� �Է�(1-6) : ");
		int b = input.nextInt();
		myCar.changeGear(b);

		System.out.println("\n���� �ӵ� = " + myCar.speed);
		System.out.print("������ �ӵ� �Է� : ");
		int c = input.nextInt();
		myCar.speedUp(c);

		System.out.println("\n���� �ӵ� = " + myCar.speed);
		System.out.print("������ �ӵ� �Է� : ");
		int d = input.nextInt();
		myCar.speedDown(d);

		System.out.println(myCar);

	}
}

