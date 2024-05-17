
//TreeMap

import java.util.*;

class TreeMapDemo{

	public static void main(String args[]){
		//:{AUS=Australia, BAN=Bangladesh, Ind=India, PAK=Pakistan, SL=Srilanka}
		TreeMap tm=new TreeMap();
		tm.put("Ind","India");
		tm.put("PAK","Pakistan");
		tm.put("SL","Srilanka");
		tm.put("AUS","Australia");
		tm.put("BAN","Bangladesh");
		System.out.println(tm);
	}
}

