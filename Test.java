
class car{
	void move() {
		System.out.println("Car is move");
	}
	void brake() {
		System.out.println("This is a Brake");
		
	}
}

class Audi extends car{
		void autopilot() {
			System.out.println("This Audi on an autopilot mode");
		}
		
		void autogear() {
			System.out.println("Audi is in autogear mode");
		}
}

public class Test {

	public static void main(String[] args) {
		car c = new car();
		c.move();
		c.brake();
		
		Audi a = new Audi();
		a.move();
		a.brake();
		a.autopilot();
		a.autogear();
		
	}

}