package collection;

import java.util.HashSet;

public class collection_set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();   // Hashset not maintain the order 
		
		hs.add(12);
		hs.add(15);
		hs.add(27);
		hs.add(50);
		
		
		for(Integer a: hs)
		{
			System.out.println(a);
		}
		

	}

}
