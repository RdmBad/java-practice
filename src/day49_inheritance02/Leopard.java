package day49_inheritance02;

public class Leopard extends Animal {
			
	public Leopard() {
		super(); // call parent class no-args constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		//setType(type);
		super(type); //call Animal(String type constructor)
		System.out.println("Leopard 1 Arg constructor");
	}
}
