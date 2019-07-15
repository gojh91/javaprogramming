//2011335002
package java0920;

public class Car {
	String color;
	int speed;
	int gear;

	@Override
	public String toString() {
		return "색상 = " + color + "\n속도 = " + speed + "\n기어 = " + gear;
	}

	void changeColor(int a) {
		if (a >= 1 && a <= 3) {
			if (a == 1)
				color = "red";
			else if (a == 2)
				color = "blue";
			else
				color = "yellow";
			System.out.println("changeColor!");
		}

		else
			System.out.println("Error!");
	}

	void changeGear(int b) {
		if (b >= 1 && b <= 6) {
			System.out.println("changeGear!");
			gear = gear + b;
		} else
			System.out.println("Error!");
	}

	void speedUp(int c) {
		if (c >= 0) {
			System.out.println("speedup!");
			speed = speed + c;
		} else
			System.out.println("Error!");
	}

	void speedDown(int d) {
		if (speed - d >= 0) {
			System.out.println("speedDown!\n");
			speed = speed - d;
		} else
			System.out.println("Error!\n");

	}

}
