package test;

import com.hsbc.banking.entity.Account;
import com.hsbc.banking.exception.LowBalanceException;
import com.hsbc.banking.task.TaskDeposit;
import com.hsbc.banking.task.TaskWithdraw;

public class BankAppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*we are implementing 1 at a time not all at the same time*/
		
		/*when multiple threads trying to access same resource at the same time leads to a problem known as "RACE CONDITION".
		so they will interfere each others operations*/

		Account account = new Account(1, 40000);

		TaskWithdraw taskWithdraw = new TaskWithdraw(account);
		TaskDeposit taskDeposit = new TaskDeposit(account);

		Thread husbandWorker = new Thread(taskWithdraw, "Husband"); 

		Thread wifeWorker = new Thread(taskDeposit, "Wife");

		/* only one of them will get executed successfully*/
		husbandWorker.start();

		wifeWorker.start();

		/* When multiple threads trying to access same resource at the same time 
		 * leads to a problem know as RACE CONDITION !! and they will try to interfere*/

		/*when multiple threads trying to access same resource at the same time leads to a problem known as "RACE CONDITION".
		so they will interfere each others operations*/
		


//		try {
//			account.withdraw(41000);
//			System.out.println(account.getAccountBalance());
//
//		} catch (LowBalanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
