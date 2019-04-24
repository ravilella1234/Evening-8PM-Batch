package com.hdfc.loans.educationloans;

public class Wrapper 
{

	public static void main(String[] args) 
	{
		//Boxing process using Constructors
		Integer i1=new Integer(100);
		Integer i2=new Integer("101");
		
		//Boxing process using valueOf() Method
		Integer i3=Integer.valueOf(125);
		Integer i4=Integer.valueOf("126");
		
		System.out.println("i1 :" + i1);
		System.out.println("i2 :" + i2);
		
		System.out.println("i3 :" + i3);
		System.out.println("i4 :" + i4);
		
		
		//Un-Boxing process 
		int a=i1.intValue();
	}

}
