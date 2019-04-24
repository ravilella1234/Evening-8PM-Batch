package com.hdfc.loans.educationloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo 
{

	public static void m1() 
	{
		try {
			BufferedReader r=new BufferedReader(new FileReader("d://abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		m1();

	}

}
