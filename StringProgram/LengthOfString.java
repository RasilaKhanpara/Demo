package stringProgram;

public class LengthOfString {

	public static void main(String[] args) {
					
			String name = "Refrigerator"; 
			
			//Using length method we can find total length of word
			
			System.out.println("Length of \"Refrigerator\" is : " + name.length());
			System.out.println("\nUppercase of \"Refrigerator\" is : " + name.toUpperCase());
			System.out.println("\nLowercase of \"Refrigerator\" is : " + name.toLowerCase());
			System.out.println("\nContains R in \"Refrigerator\" is : " + name.charAt(0));
			
			
			
			//	Using for loop
				for (int i = 0; i < name.length(); i++) {
				System.out.println(i);
				
			}

			
	}
}