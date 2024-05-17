
//LinkedHashSet
// Insertion Order are preserved 

import java.util.*;

class LinkedHashDemo{

	public static void main(String [] args){

		LinkedHashSet hs=new LinkedHashSet();

		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ram");
		hs.add("Kanha");

		System.out.println(hs);


	}
}


