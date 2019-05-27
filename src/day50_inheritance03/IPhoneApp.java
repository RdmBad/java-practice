package day50_inheritance03;

public class IPhoneApp extends App {

	public IPhoneApp() {
		super("IPhone App - unknown");
	}

	public IPhoneApp(String name) {
		super(name);
	}

	private String developer;

	public String getOwner() {
		return developer;
	}

	public void setOwner(String owner) {
		this.developer = owner;
	}
}
