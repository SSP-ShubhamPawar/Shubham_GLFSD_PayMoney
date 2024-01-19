package com.example.main;

import java.util.Arrays;
import java.util.Scanner;

public class NoteMain {
	public static void main(String args[]) 
	{
		int arraySize =0;
		System.out.println("Enter the size of Currency Denomination");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
			arraySize = sc.nextInt();
		}
		int denomination[] = new int[arraySize];
		System.out.println("Enter the current denomintion value");
		for (int i = 0; i < arraySize ; i++)
		{
			if(sc.hasNextInt())
			{
				denomination[i] = sc.nextInt();
			}
		}
		System.out.println("Enter the number of amount you want to pay");
		int amount = 0;
		if(sc.hasNextInt())
		{
			amount = sc.nextInt();
		}
		//
		Arrays.sort(denomination);	
		System.out.println("Your Payment approach in order to give min no of notes will be");

		split(denomination,amount,0,0,arraySize-1);
		
		
	

	}
	public static int split(int[] denomination,int amount,int countNotes, int i, int arraySize) {
	// TODO Auto-generated method stub
		if (i > arraySize)
		{
		return 0;
		}
		if (amount < denomination[arraySize])
		{
			if (countNotes>0) 
			{
				System.out.println(denomination[arraySize] +" : " + countNotes );
			}
		return split(denomination,amount,0,i,arraySize-1);
		}
		else 
		{
			amount = amount -  denomination[arraySize];
			countNotes ++;
			split(denomination,amount,countNotes,0,arraySize);

		}
		
		
		
	  return 0;
	  
	
}

}

