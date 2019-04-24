package com.hdfc.loans.educationloans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		
		 ListIterator<Integer> val = a.listIterator();
		while(val.hasNext())
		{
			Integer var = val.next();
			if(var!=10)
				val.remove();
			else
				val.set(100);
		}
		System.out.println(a);
	}

}
