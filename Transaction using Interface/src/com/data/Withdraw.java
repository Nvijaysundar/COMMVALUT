package com.data;

public class Withdraw implements Transaction{

	public void process(float amt) {
		Transaction.b.balance -= amt;
		System.out.println("Available Balance: "+Transaction.b.getbal());
	}
	
}
