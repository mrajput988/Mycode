package rampupjava;

public class Palindrome {

	public static void main(String[] args) 
	{
		int number=121;
		int sum=0;
		int old=number;
		int r;
		
		while(number>0)
		{
			r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		
		if (old==sum)
		{
			System.out.println("Palindrome no");
		}
		else 
		{
			System.out.println("Not");
		}

	}

}
