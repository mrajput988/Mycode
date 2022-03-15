package rampupjava;

public class Scanner {

	public static void main(String[] args) 
	{

		int a;
		
		System.out.println("Please enter the value");
		java.util.Scanner s = new java.util.Scanner(System.in); // Scanner class in java which used for taking input from  the users 
		a =s.nextInt();
		System.out.println(a);

	}

}
