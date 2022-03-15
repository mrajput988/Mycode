package Abstraction;

import java.util.Scanner;

public class classC implements interface1
{
	public void sum()
	{
		int a, b;
		int sum =0;
	System.out.println("Please enter A");
	Scanner s1 = new Scanner(System.in);
	a = s1.nextInt();
	System.out.println();
	Scanner s2 = new Scanner(System.in);
	b= s2.nextInt();
	
	sum = a+b;
	
	System.out.println("Sum of A and B is" + sum);
	
	}
	
	public static void main(String args[])
	{
		classC manoj =new classC();
		manoj.sum();
	}

}
