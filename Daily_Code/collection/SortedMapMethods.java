//SortedMap method
//

import java.util.*;

class SortedMapDEMO{

	public static void main(String [] args){

		SortedMap hm=new TreeMap();

		hm.put("Ram","Pune");
		hm.put("Sham","Mumbai");
		hm.put("Om","A.nagar");
		hm.put("Aditya","Pune");

		System.out.println(hm);
		
		//submap
		System.out.println(hm.subMap("Aditya","Om"));

		//headMap
		System.out.println(hm.headMap("Om"));

		//tailMap
		System.out.println(hm.tailMap("Om"));
		
		//firstKey
		System.out.println(hm.firstKey());

		//lastKey
		System.out.println(hm.lastKey());

		//keyset
		System.out.println(hm.keySet());

		//values
		System.out.println(hm.values());

		//entryset
		System.out.println(hm.entrySet());

	}
}
