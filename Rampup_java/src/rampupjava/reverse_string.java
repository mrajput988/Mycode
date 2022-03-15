package rampupjava;

public class reverse_string {

	public void rever()
	{
	String s= "my name is manoj";
	
	String[] s1= s.split("");
	int i;
	for(i=s1.length-1; i>=0;i--)
	{
		System.out.print(s1[i]);
	}
	
		
	}
	
	public static void main(String[] agrs)
		
	{
		reverse_string manoj = new  reverse_string();
		manoj.rever();
	}
}
