package day24_arrays1;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";
		// this method toCharArray() converts string into array of characters
		char[] chars = str.toCharArray();
		for(char c: chars ) {
			System.out.print(c + "_");
			
	}
		System.out.println();
		str = "";

		for(int i = chars.length-1; i >= 0; i--) {
			str += chars[i];
			
		}
		System.out.println(str);
	
	//task 
		//Print characters with help of array of characters, one by one
		//if characters is equal to 'o' replace with (print it instead of 'o') '*'1
		
		for(char c: chars) {}
			if (c == 'o') {
				System.out.println("*"));
			}else {
				System.out.println(c);
			}
		}
		
	
	}
}
