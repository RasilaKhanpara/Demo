package multiThreading;

public class deamonThread extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("Child Thread...");
		}
		
	}
	
	public static void main(String[] args) {
		
		//If we did not provide anything in main method then its not going to give us output 
		//Because daemon thread provide service to thread.
		
		System.out.println("Main Thread");

		deamonThread d = new deamonThread();
		d.setDaemon(true); 
		//We have to create a daemon thread before start() method. otherwise it will give us illegal thread state exception error
		d.start();  
		
		
	}

}
