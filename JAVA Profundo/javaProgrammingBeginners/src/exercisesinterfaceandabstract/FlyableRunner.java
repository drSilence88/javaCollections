package exercisesinterfaceandabstract;
interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("with wings");
	}
}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("with fuel");
	}
}

public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyable = {new Bird(), new Aeroplane()};
		for(Flyable objectflying : flyable) {
			objectflying.fly();
		}
	}
}
