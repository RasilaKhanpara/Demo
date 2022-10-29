package collectionDemo;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		
		Queue<Integer> vip = new LinkedList<>();
		
		vip.offer(40);
		vip.offer(12);
		vip.offer(24);
		vip.offer(36);
	
		System.out.println(vip);
		
		vip.poll();
		System.out.println(vip);
		
		System.out.println(vip.peek());
		
		
	}

}
