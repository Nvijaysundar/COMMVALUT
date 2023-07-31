package com.data;
import java.util.Scanner;
public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Deposit\n2.Withdraw");
			switch(sc.nextInt())
			{
			case 1:
				new Deposit().process(sc.nextFloat());
				break;
			case 2:
				new Withdraw().process(sc.nextFloat());
				break;
			case 3:
				System.out.println("Available Balance: "+Transaction.b.getbal());
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}
	}
}
