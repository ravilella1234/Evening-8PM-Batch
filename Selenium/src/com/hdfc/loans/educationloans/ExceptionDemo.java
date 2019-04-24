package com.hdfc.loans.educationloans;

import java.util.Scanner;

public class ExceptionDemo 
{
	static int nr,dr,result;
	
	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
			
		
		while (true) 
		{
			System.out.println("Enter Numarotor value : ");
			nr=sc.nextInt();
			System.out.println("Enter Denominator value : ");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			
			catch (Exception e) 
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than Zero...");
			} 
			
					
			
			
		}

	}

}
