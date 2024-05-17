// Methods
//
import java.util.*;

class SortedSetDemo{

	public static void main(String [] args){

		SortedSet ss=new TreeSet();

		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Ashish");
		ss.add("Badhe");

		System.out.println(ss);  //[Ashish,Badhe,Kanha,Rajesh]
		System.out.println(ss.headSet("kanha"));
		System.out.println(ss.tailSet("Kanha"));
		System.out.println(ss.subSet("Badhe","kanha"));
		System.out.println(ss.first());
		System.out.println(ss.last());

	}
}

