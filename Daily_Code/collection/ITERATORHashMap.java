

//Iterator in map

import java.util.*;

class IteratorMapDemo{

	public static void main(String [] args){

		SortedMap tm=new TreeMap();

		tm.put("IND","India");
		tm.put("PAK","Pakistan");
		tm.put("SL","Srilanka");

		System.out.println(tm);
		Set<Map.Entry> data=tm.entrySet();
		Iterator<Map.Entry> itr=data.iterator();

		while(itr.hasNext()){
			Map.Entry abc=itr.next();
			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}

