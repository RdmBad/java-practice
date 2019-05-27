package day50_inheritance03;

public class Dog extends Animal {
	public void speak() {
		System.out.println("Doggy saying woof woof");
	}

	public void move(int steps) {
		System.out.println("Doggy is moving " + steps + " steps");
	}

}
