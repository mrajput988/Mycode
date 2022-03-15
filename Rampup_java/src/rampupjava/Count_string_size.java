package rampupjava;

public class Count_string_size {

	public static void main(String[] args) {


		String s = "My Name is Manoj Singh";
		//String[] s1= s.split("");
		
		int upper =0;
		int lower =0;
		
      
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
				
			}
			else
			{
				lower++;
				
				
				
			}
		//	System.out.println("Upper"+ upper);
			//System.out.println("Lower"+ lower);
		}
		System.out.println("Upper"+" "+ upper);
		System.out.println("Lower"+" "+ lower);
		
	}

}
