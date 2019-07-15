package java1011;

class Car {
	int speed;

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class SportsCar extends Car {
	boolean turbo;

	public void setTurbo(boolean flag) {
		turbo = flag;
	}
}

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();

		obj.speed = 10;
		System.out.println("속도=" + obj.speed + ", 터보=" + obj.turbo);

		obj.setSpeed(60);
		obj.setTurbo(true);

		System.out.println("속도=" + obj.speed + ", 터보=" + obj.turbo);
	}
}
