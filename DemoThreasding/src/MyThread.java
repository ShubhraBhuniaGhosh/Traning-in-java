
public class MyThread extends Thread{
	
	@Override
	public void run() {
		/*running stage of the thread, this is the next stage of thread life-cycle*/
		String name = Thread.currentThread().getName();
		
		/*currentThread - > static  getName - > non-static*/
		System.out.println("Started performing some background task "+name);
		
		System.out.println("----------------------------------------------"+name);
		
		System.out.println("Completed some background task "+name);
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i+" "+name);
		}

	}
	/*Thread goes to new stage of its life called "termination"*/
}
