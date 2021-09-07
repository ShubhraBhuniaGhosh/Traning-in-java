package demorunnable;

public class MyTask implements Runnable{

	
	/*run method contains job (work to be done by thread) to be done by thread
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Performing some task named: " + Thread.currentThread().getName());
//		try {
//			/*sleep - > static*/
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("completed some task named: " + Thread.currentThread().getName());
	}
}
