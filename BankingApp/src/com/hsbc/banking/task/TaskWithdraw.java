package com.hsbc.banking.task;

import com.hsbc.banking.entity.Account;
import com.hsbc.banking.exception.LowBalanceException;

public class TaskWithdraw implements Runnable{

	private Account account;

	public TaskWithdraw(Account account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.withdraw(30000);
		} catch (LowBalanceException e) {
			e.printStackTrace();
		}
	}

}
