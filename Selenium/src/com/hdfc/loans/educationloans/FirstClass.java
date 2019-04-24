package com.hdfc.loans.educationloans;

public class FirstClass 
{
	int eno;
	String ename;
	float sal;
	
	public FirstClass()
	{
		System.out.println("iam default constructor...");
	}

	public FirstClass(int eno, String ename) 
	{
		this(1744);
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public FirstClass(int eno) 
	{
		this();
		this.eno=eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public FirstClass(int eno, String ename, float sal) 
	{
		this(1745,"sai");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public static void main(String[] args) 
	{
	
		FirstClass f3=new FirstClass(1746,"kumar",20000.23f);
	
	}

}
