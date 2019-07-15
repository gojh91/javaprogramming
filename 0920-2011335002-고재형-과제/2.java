//2011335002
package java0920;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();

		Scanner input = new Scanner(System.in);

		System.out.print("색상 입력(1-3) : ");
		int a = input.nextInt();
		myCar.changeColor(a);

		System.out.print("\n기어 입력(1-6) : ");
		int b = input.nextInt();
		myCar.changeGear(b);

		System.out.println("\n현재 속도 = " + myCar.speed);
		System.out.print("증가할 속도 입력 : ");
		int c = input.nextInt();
		myCar.speedUp(c);

		System.out.println("\n현재 속도 = " + myCar.speed);
		System.out.print("감소할 속도 입력 : ");
		int d = input.nextInt();
		myCar.speedDown(d);

		System.out.println(myCar);

	}
}

