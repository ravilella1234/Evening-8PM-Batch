package com.hdfc.loans.educationloans;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		Enumeration<Integer> var = v.elements();
		while(var.hasMoreElements())
		{
			Integer val = var.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		System.out.println(v);
	}

}
