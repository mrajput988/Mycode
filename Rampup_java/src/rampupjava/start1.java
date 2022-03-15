package rampupjava;

public class start1 
{

	int a;   //Global variable
	
	public void manoj()
	{
		
		System.out.println("Hi manoj");
		
		
	}
	
	
	public static void main(String args[]) 
	{
		start1 ms = new start1();   // Object creation ---> create with class name and the reference variable
		
		ms.manoj();
		
	    ms.a =12;
	
	System.out.println(ms.a);
	
	ms.a= 13;
	
	System.out.println(ms.a);

		
		
	}
	
	
}
