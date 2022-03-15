package collection;

import java.util.LinkedHashSet;

public class liknkhashset {

	public static void main(String[] args) {


		
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();  // LinkedHashSet maintain the order 
		
		hs.add(13);
		hs.add(18);
		hs.add(199);
		hs.add(0);
		
		for(int a :hs)
		{
			System.out.println(a);
		}

	}

}
