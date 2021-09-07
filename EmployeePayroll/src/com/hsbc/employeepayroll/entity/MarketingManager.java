package com.hsbc.employeepayroll.entity;

public class MarketingManager extends Manager{
	private int marketingEvents;

	public MarketingManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MarketingManager(int marketingEvents, int numberOfProject, int salary, String name) {
		super(numberOfProject, salary, name);
		this.marketingEvents = marketingEvents;
	}
	
}
