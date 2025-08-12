package MutliThreading;

public class ThreadUsingRunnableInterface implements Runnable {

	public void run() {
		System.out.println("Thread" + Thread.currentThread().getId() + "is running");
		
	}

}
