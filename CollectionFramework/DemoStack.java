package collectionDemo;

//import java.util.Iterator;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack<String> color = new Stack<String>();  
		
		//To add elements use push(); function
		
		color.push("White");  
		color.push("Red");  
		color.push("Yellow");  
		color.push("Green");  
		color.push("Pink");  
		
		/*color.pop();  //it return last item of the object  
		
		Iterator<String> itr=color.iterator();  
			while(itr.hasNext()){  
		System.out.println(itr.next());  */
		
		System.out.println(color);

		color.pop(); 	//it remove Top elements 
		
		System.out.println(color.peek());		
		
		}

}
