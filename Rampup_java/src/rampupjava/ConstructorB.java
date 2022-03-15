package rampupjava;

public class ConstructorB extends ConstructorA
{

	public ConstructorB()
	{
		
		System.out.println("Defualt constructor of B");
	}
	
	public ConstructorB(int a)
	{
		
		System.out.println("1 Parametrized constructor of B");
	}
	
	public ConstructorB(int a, int b)
	{
		super(1);
		System.out.println("2 Parametrized constructor of B");
	}
	
	public static void main(String args[])
	{
		ConstructorB manoj = new ConstructorB(12);
		
		
	}
}
