package com.data;
import java.util.*;
public class Product implements Comparable{
	String name,id;
	float price;
	int qty;
	public Product(String name, String id, float price, int qty) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.qty = qty;
	}
	public String toString()
	{
		return this.name+"\t"+this.id+"\t"+String.valueOf(this.qty)+
				"\t"+String.valueOf(this.price)+"/-";
	}
	
	public static void main(String[] args) {
		Set<Product> ob = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			ob = new HashSet<Product>();
			break;
		case 2:
			ob = new LinkedHashSet<Product>();
			break;
		case 3:
			ob = new TreeSet<Product>();
			break;
		}
		while(true)
		{
			System.out.println("1.Insert\n2.Display");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				ob.add(get_a_product(sc));
				break;
			case 2:
				for(Product temp:ob)
				{
					System.out.println(temp.toString());
				}
				break;
			}
					
		}
	}
	private static Product get_a_product(Scanner sc) {
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Id: ");
		String Id = sc.nextLine();
		System.out.println("Enter Price:: ");
		float price = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Qty: :");
		int qty = Integer.parseInt(sc.nextLine());
		return new Product(name, Id, price, qty);
	}
	
	public int compareTo(Object o) {
		Product temp = (Product)o;
		if(this.price >temp.price)
			return 1;
		else if(this.price <temp.price)
		return -1;
		return 0;
	}
}	
