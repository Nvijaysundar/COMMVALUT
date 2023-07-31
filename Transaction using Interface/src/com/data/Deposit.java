package com.data;
public class Deposit implements Transaction {
	public void process(float amt) {
		Transaction.b.balance += amt;
		System.out.println("Available Bal:: "+Transaction.b.getbal());
	}
	
}
