package rampupjava;

public class upper_and_lower {

	public static void main(String[] args) {

 String s= "My Name is Manoj Singh";
  String upper="";
 String lower="";
 
 for(int i=0;i<s.length();i++)
 {
	 char ch = s.charAt(i);
	 
	 if(ch>=65 && ch<=90)
	 {
		 upper= upper+ch;
	 }
	 else
	 {
		 lower =lower+ch;
		
	 }
 }
 System.out.println("Upper"+" "+upper);
 System.out.println("Lower"+" "+lower);
	}

}
