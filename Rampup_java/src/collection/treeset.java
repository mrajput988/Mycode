package collection;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {


		TreeSet<Integer> hs = new TreeSet<Integer>();  // will give in accending order.
		
		hs.add(122);
		hs.add(332);
		hs.add(12);
		hs.add(11);
		hs.add(8);
		
		for(int a: hs)
		{
			System.out.println(a);
		}

	}

}
