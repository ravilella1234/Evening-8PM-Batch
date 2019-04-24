package com.hdfc.loans.educationloans;

public class SecondClass extends FirstClass
{
	String address;

	public SecondClass(String address) 
	{
		super(1,"abc",100.11f);
		this.address=address;
		System.out.println(this.address);
	}
	
	public void m1()
	{
		System.out.println(super.sal);
	}

	public static void main(String[] args) 
	{
		SecondClass s=new SecondClass("hyderabad");

	}

}
