//2011335002
package java1025;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

class FlyingCar implements Drivable, Flyable {
	public void drive() {
		System.out.println("I'm driving");
	}

	public void fly() {
		System.out.println("I'm flying");
	}
}

public class FlyingCarTest {
	public static void main(String args[]) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
}
