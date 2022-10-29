package collectionDemo;

import java.util.LinkedList;

public class DemoLinkedList {
	
	public static void main(String[] args) {

				LinkedList<String> fruitName = new LinkedList<String>();
				
				fruitName.add("Apple");
				fruitName.add("Banana");
				fruitName.add("Apple");
				fruitName.add("Avocado");
				
			
				System.out.println(fruitName.getFirst()); //Give first name of fruit
			
				//System.out.println(fruitName.getLast());  //Give last name of fruit
				
				//System.out.println(fruitName);
	 } 
}
