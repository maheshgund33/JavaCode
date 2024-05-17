//sort arrayList with out using arrayList

import java.util.*;


class SortListDemo{

	public static void main(String [] args){

		ArrayList al=new ArrayList();

		al.add("Kanha");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Badhe");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);

	}
}
