package stringProgram;

public class CheckLetter {

	//Using charAt() method to find a letter 'e' from word Umbrella
	
	private static int word;

	public static void main(String[] args) {
		
		String name = "Umbrella"; 
		boolean check = true;
		
		for(int i = 0; i < name.length(); i++) {
			
		}
		while(name.charAt(word) == 'e') {
			
			check= true;
			break;
		}
		
		System.out.println(check);
		
	}
}
	