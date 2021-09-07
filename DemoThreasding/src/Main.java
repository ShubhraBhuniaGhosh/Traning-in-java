
public class Main {

	public static void main(String[] args) {
		
		/* what is not guaranteed is how long a thread will run
		 * which thread runs first and in which order
		 * but it is guaranteed that all the thread will get executed completed
		 * sequence of execution inside the thread is guaranteed
		 * every thread has its own thread of execution*/
		
		
		/*main is also a thread is java 
		 *whatever the code is we write runs in main thread 
		 *one more thread is there "garbage collected"*/
		System.out.println(Thread.currentThread().getName());
		
		/*first stage of any thread is "born" or new(sometimes referred as)*/
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		/*we can give meaningful name to the thread*/
		thread1.setName("Download thread");
		thread2.setName("Upload thread");

		System.out.println("Strating");
		

		thread2.start();
		
		/*This stage is a "ready to run" stage it is also sometimes referred to as "runnable"
		 * in response to call to start run method is executed*/
		thread1.start();
		
		System.out.println("Completed");
		
	}

}
