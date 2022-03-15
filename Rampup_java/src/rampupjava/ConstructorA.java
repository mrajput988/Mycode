package rampupjava;

public class ConstructorA
{

	public ConstructorA()
	{
		this(12);
		System.out.println("Default constructor of A");
	}
	
	public ConstructorA(int a)
	{
		
		System.out.println("1 Parametrized constructor of A");
	}
	
	public ConstructorA(int a, int b)
	{
		System.out.println("2 Parametrized constructor of A");
	}
}
