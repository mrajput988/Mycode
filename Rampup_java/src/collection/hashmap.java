package collection;

import java.util.HashMap;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(12, "Manoj");
		hm.put(13, "singh");
		hm.put(15, "swati");
		
		Set<Integer> keys = hm.keySet();
		
		for(int a:keys)
		{
			System.out.println(a +" "+ hm.get(a));
		}

	}

}
