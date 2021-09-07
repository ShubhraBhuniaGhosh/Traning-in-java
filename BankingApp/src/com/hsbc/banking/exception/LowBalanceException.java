package com.hsbc.banking.exception;

public class LowBalanceException extends Exception {

	private int lowBalance;

	public LowBalanceException(int lowBalance) {
		this.lowBalance = lowBalance;
	}

	@Override
	public String toString() {
		return "Cannot withdraw ammound due to low balance \nCurrent Balaence:\t" + this.lowBalance;
	}

}
