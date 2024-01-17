package com.example.main;

import java.util.Scanner;

public class PayMoneyMain {
	
	public static void main(String args[]) 
	{
		int arraySize =0;
		System.out.println("Enter the size of trannsaction array");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
			arraySize = sc.nextInt();
		}
		int trans[] = new int[arraySize];
		System.out.println("Enter the value of array");
		for (int i = 0; i < arraySize ; i++)
		{
			if(sc.hasNextInt())
			{
				trans[i] = sc.nextInt();
			}
		}
		System.out.println("Enter the number of target to be achieved");
		int noOftarget = 0;
		if(sc.hasNextInt())
		{
			noOftarget = sc.nextInt();
		}
		for (int i = 0; i < noOftarget ; i++ ) 
		{
		System.out.println("Enter the value of target");
		if(sc.hasNextInt())
		{
			int target  = sc.nextInt();
			int sumOfTran = 0;
			for(int j = 0; j < trans.length; ) 
			{
				sumOfTran  += trans[j]; 
				int count  = j + 1 ;
				if(target > sumOfTran)
				{
					j++;
				}
				else
				{
				System.out.println("Target achieved after "+ count +" transactions");
				break;
				}
			}
			if (target > sumOfTran)
			{
				System.out.println("Given Target is not achieved");
			}
		} 
				
		}
		

		
	}
	

}
