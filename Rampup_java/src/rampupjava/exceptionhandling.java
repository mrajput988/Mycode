package rampupjava;

public class exceptionhandling {

	public static void main(String[] args) 
	{

		System.out.println("first line");
		try
		{
		int a=4/0;  // shows execption but handled by try catch method
		//System.out.println("scond line");
		}
		catch (Exception e) 
		{
			//System.out.println("scond line");
			e.printStackTrace();   // Used to find the reason of execption
		}
		System.out.println("test");
		


	}

}
