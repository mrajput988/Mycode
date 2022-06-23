package rampupjava;

public class string_handling {

	public static void main(String[] args) 
	{
		String s = "My Name is manoj";
		String [] s1= s.split(" "); 
		char ch;
		int i;
		
		for(i=s1.length-1;i>=0;i-- )
		{
		
			// ch = s.charAt(i);
			 
			// System.out.print(ch);
			
			System.out.print(s1[i]);
		}
		

	}

}
