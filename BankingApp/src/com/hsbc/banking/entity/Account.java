package com.hsbc.banking.entity;

import com.hsbc.banking.exception.LowBalanceException;

public class Account {
	private int accountNumber;
	private int accountBalance;
	
	public Account(int accountNumber, int accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public synchronized void withdraw(int ammount) throws LowBalanceException {
		/*synchronized: we are locking the resource. No 2 threads can access 
		 *we are locking the resources.  So only one thread can access the resourse at a time.*/
		System.out.println("Balence Checked by:\t" + Thread.currentThread().getName() + "\t balance is:\t" + this.accountBalance);
		if(this.accountBalance >= ammount) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			this.accountBalance -= ammount;
			System.out.println("Whithdrawal Successful by:\t" + Thread.currentThread().getName() + "\t balance is:\t" + this.accountBalance);
		}else {
		throw new LowBalanceException(this.accountBalance);
		}
	}
	
	public synchronized void deposit(int ammount) {
		System.out.println("Balence Checked by:\t" + Thread.currentThread().getName() + "\t balance is:\t" + this.accountBalance);
		this.accountBalance += ammount;
		System.out.println("Deposition Successful by:\t" + Thread.currentThread().getName() + "\t balance is:\t" + this.accountBalance);

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
	
}
