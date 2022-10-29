package collectionDemo;

import java.util.Iterator;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		
		v.add("Ted");
		v.add("Lisa");
		v.add("Monica");
		v.add("Terry");
		
		v.remove(2); //it remove Monica because it's start with a 0.
		
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		}
	}

}
