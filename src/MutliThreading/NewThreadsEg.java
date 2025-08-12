package MutliThreading;

class NewThreadsEg extends Thread{

	public void run() {
		System.out.println("Thread is running");
		
	}
	
	
		class test {
			public static void main(String[] args) {
				
				NewThreadsEg t1 = new NewThreadsEg ();
				
				t1.start();
				
		}

	}
		class test1 {
			public static void main(String[] args) {
				
				NewThreadsEg t1 = new NewThreadsEg ();
				
				t1.start();
			}
}
}