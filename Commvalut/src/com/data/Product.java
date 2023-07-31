package com.data;
public class Product {
	static int count;
	String pid,pname;
	float pprice;
	static 
	{
		System.out.println("This is static block");
		count =0;
	}
	{
		count++;
	}
	public Product()
	{
		this.pid = "A121";
		this.pname ="Mouse";
		this.pprice = 456.85f;
	}
	public Product(String pid, String pname, float pprice) {
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	public String toString()
	{
		return this.pid+this.pname+this.pprice;
	}
	
	 static int counter(){
		return count;
	}
	 public static void main(String[] args) {
		System.out.println(counter());
		Product p1 = new Product();
		Product p2 = new Product("A111","CDDR",748.65f);
		System.out.println(counter());
	}
}
