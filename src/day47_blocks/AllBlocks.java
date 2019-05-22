package day47_blocks;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("STATIC BLOCK  - i run first and  only once");
		staticInt--;
	}

	{
		System.out.println("INIT BLOCK - i run each time object is created. before constructor");
		nonStaticInt += 5;
		staticInt += 5;
	}

	public AllBlocks() {
		System.out.println("CONSTRUCTOR - i run each time object is created. after INIT BLOCK");
		nonStaticInt += 3;
		staticInt += 3;
	}
}
