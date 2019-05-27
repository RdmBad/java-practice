package day50_inheritance03;

public class AndroidApp extends App {
	private String developer;

	public AndroidApp() {
		super("Android App - unknown");
	}

	public AndroidApp(String name) {
		super(name	);
	}


	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

}
