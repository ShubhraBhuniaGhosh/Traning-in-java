package demorunnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*in run() we write the code of the task we want to perform*/
		
		/*THIS IS HOW WE SHOULD BE CREATING THREADS.
		 * Reasons of doing it this way if i am inheriting some other class we 
		 * will not be able to inherent threads*/
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		/*Default priority of any thread is determined by the threads priority  
		 *which is this thread (cheater thread priority = default priority if created thread)
		 *
		 *It is not always true that a thread which has higher priority will always run first*/
		
		MyTask task = new MyTask();
//		Thread worker = new Thread(task);
		
		/*we we want to specify the name of the thread then we can do it like this */
		Thread worker1 = new Thread(task, "demo1");
//		worker1.setPriority(10);
		/* Thread is not alive when it is created and when it is terminated*/
		System.out.println(worker1.isAlive());
		
		System.out.println(Thread.currentThread().getPriority());
		
		/*every thread has some priority 1 -> lowest,  10-> highest*/
		System.out.println(worker1.getPriority());

		worker1.start();

		Thread worker2 = new Thread(task, "demo2");
//		worker2.setPriority(9);

		System.out.println(worker2.getPriority());

		worker2.start();
	}

}
