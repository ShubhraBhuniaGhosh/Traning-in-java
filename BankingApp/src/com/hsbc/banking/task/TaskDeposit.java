package com.hsbc.banking.task;

import com.hsbc.banking.entity.Account;

public class TaskDeposit implements Runnable{

	private Account account;

	public TaskDeposit(Account account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(10000);
	}

}
