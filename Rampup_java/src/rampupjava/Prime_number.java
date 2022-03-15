package rampupjava;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args)
	{
		
		int num = 14;
		int v=0;
		int half= num/2;
	
		for(int i=2; i<=half;i++)
		{
			if(num%i==0)
			{
			System.out.println(" Not a Prime Number");
			v=1;
			break;
		}
		}
		if(v==0)
		{
			System.out.println("Number is A Prime Number");
		}
		

	}

	}

