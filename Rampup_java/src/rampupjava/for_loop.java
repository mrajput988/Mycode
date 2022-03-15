package rampupjava;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) 
	{
 
		int i;
		System.out.println("Enter no");
		//Scanner s = new Scanner(System.in);
		//i = s.nextInt();
		for(i=1;i<=20;i++)
		{
			Scanner s = new Scanner(System.in);
			i = s.nextInt();
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				
			}
			
		}
		

	}

}
