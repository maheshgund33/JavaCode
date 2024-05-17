//Sorted hashmap
//

import java.util.*;

class SortedHashMapDEMO{

	public static void main(String [] args){

		HashMap hm=new HashMap();

		hm.put("Ram","Pune");
		hm.put("Sham","Mumbai");
		hm.put("Om","A.nagar");
		hm.put("Aditya","Pune");

		System.out.println(hm);

		TreeMap tm=new TreeMap(hm);

		System.out.println(tm);
	}
}
