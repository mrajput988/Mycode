package rampupjava;

import java.util.Scanner;

public class else_if_ladder {

	public static void main(String[] args)
	{
		
		int marks;
		System.out.println("Please Enter Marks");
		Scanner s =new  Scanner(System.in);
		marks = s.nextInt();
		if((marks>0)&&(marks<33))
		{
			System.out.println("Failed");
			
		}
		else if ((marks>=33)&&(marks<60))
		{
			System.out.println("Pass");
		}
		else if ((marks>60)&&(marks<80))
		{
			System.out.println("First Devision");
		}
		else if ((marks>70)&&(marks<=100))
		{
			System.out.println("Merit");
		}
		else
		{
			System.out.println("Invalid");
		}
			
		}

	
	}


