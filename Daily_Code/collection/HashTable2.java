//methods
import java.util.*;

class HashTableDemo{

	public static void main(String [] args){

		Dictionary ht=new Hashtable();

		ht.put(10,"Sachine");
		ht.put(7,"MSD");
		ht.put(8,"Virat");
		ht.put(1,"KLRahul");
		ht.put(45,"Rohit");

		System.out.println(ht);
		
		Enumeration itr1=ht.keys();
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}
		
		Enumeration itr2=ht.elements();
		while(itr1.hasMoreElements()){
			System.out.println(itr2.nextElement());
		}

		System.out.println(ht.get(10));
		ht.remove(1);
		System.out.println(ht);
	}
}

