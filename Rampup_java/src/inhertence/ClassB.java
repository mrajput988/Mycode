package inhertence;

public class ClassB extends ClassA
{

	public void xyz()
	{
		System.out.println("I am in child class");
	}
	
	public static void main(String arrgs[])
	{
		ClassB manoj = new ClassB();
		manoj.abc();
		manoj.xyz();
		
		
	}
	
	
}
