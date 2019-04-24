package com.hdfc.loans.educationloans;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h= new TreeMap<>();
		h.put(1, 100);
		h.put(3, 200);
		h.put(1, 300);
		h.put(5, 400);
		h.put(4, 200);
		
		System.out.println(h);
		
		System.out.println(h.get(5));

	}

}
