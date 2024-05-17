import java.util.*;

class IdendentityhashMapDemo{

	public static void main(String [] args){

		IdentityHashMap ihm=new IdentityHashMap();

		ihm.put(10,"Omkar");
		ihm.put(10,"Ramdas");
		ihm.put(10,"Walunj");

		System.out.println(ihm);
	}
}
