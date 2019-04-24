package com.hdfc.loans.educationloans;

import java.util.Scanner;

public class UserException extends Exception
{

	public UserException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) throws UserException 
	{
		String num;
		Scanner sc=new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter the AlpaNumber :");
			num=sc.nextLine();
			try {
				if (num.length() != 10) 
				{
					throw new UserException("Number Should be 10 digit...");
				} 
				else 
				{
					System.out.println(num);
					return;
				}
			} catch (UserException e) {
				System.out.println(e);
			} 
		}
		
		

	}

}
