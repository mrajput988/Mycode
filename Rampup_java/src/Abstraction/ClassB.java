package Abstraction;

public class ClassB extends ClassA
{
public void with_out_body()
{
	System.out.println("body given");
}
	public static void main(String args[])
	{
		ClassB manoj = new ClassB();
		manoj.with_out_body();
		}
	
}
