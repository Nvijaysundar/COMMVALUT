package com.data;

public class Circle {
	float radius;
	Circle()
	{
		radius = 5;
	}
	Circle(float radius)
	{
		this.radius = radius;
	}
	public String toString()
	{
		return String.valueOf(this.radius);
	}
	
	//str.equals(str2)
	//ob1.equals(ob2)
	public boolean equals(Object object)
	{
		Circle cir = (Circle)object;
		if(this.radius == cir.radius)
			return true;
		return false;
	}
	public float area()
	{
		return 3.14f*this.radius*this.radius;
	}
	
	public float area(Circle object)
	{
		return 3.14f*object.radius*object.radius;
	}
}
