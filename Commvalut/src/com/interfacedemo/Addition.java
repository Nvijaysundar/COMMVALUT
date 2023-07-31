package com.interfacedemo;

public class Addition implements IArithematic{
	public static void main(String[] args) {
		System.out.println(new Addition().process(78, 75));
	}

	
	public double process(int x, int y) {
		
		return x+y;
	}
}
