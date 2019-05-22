package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		// startsWith ==> tests if string starts with another
		System.out.println(word1.startsWith("e"));	//true
		System.out.println(word1.startsWith("ec"));	//true
		System.out.println(word1.startsWith("ecli"));  //true
		
		System.out.println(word1.startsWith("Ecli")); //false
		
		System.out.println(word1.endsWith("pse"));  //true
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.endsWith("java"));	//false
		
		//	"PSE"					//ECLIPSE				
		System.out.println(word1.toUpperCase().endsWith("PSE")); //true
		
		//Mr.  ==> male
		//Mrs. ==> married woman
		//Ms.  ==> some woman
		//Dr.  ==> Doctor man or woman
		// ==> unknow status
		String name = "Dr. Jackson";
		
		if (name.startsWith("Mr.")) {
			System.out.println("man");
		}else if (name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if (name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if (name.startsWith("Dr.")) {
			System.out.println("doctor");
		}else {
			System.out.println("Unknown status");
		}
	}
}
