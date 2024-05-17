
//ArrayList

import java.util.*;

class ArrayListDemo extends ArrayList{

	public static void main(String [] args){

		ArrayListDemo al=new ArrayListDemo();
		al.add(10);
		al.add(20.5f);
		al.add("Omkar");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);
		
		//int size()
		System.out.println(al.size());

		//boolean contains(Object)

		System.out.println(al.contains("Omkar"));

		//int indexOf(Object);

		System.out.println(al.indexOf(10));

		//int lastIndexOf(Onject)

		System.out.println(al.lastIndexOf("Omkar"));

		//E get(int)

		System.out.println(al.get(3));

		//E set(int , E);

		System.out.println(al.set(4,"Walunj"));
		
		//void add(int ,E)

		al.add(5,"Ram");

		//boolean addAll(Collection);
		ArrayList al2=new ArrayList();
		al2.add("sham");
		al2.add("Om");
		al2.add("kanha");

		al.addAll(5,al2);

		System.out.println(al);

		//Object[] toArray();

		Object arr[]=al.toArray();

		for(Object obj:arr){

			System.out.println(obj);
		}

		// void removeRange(int ,int)
		//ArrayListDemo obj=new ArrayListDemo();
		al.removeRange(1,3);

		System.out.println(al);
		//void clear();
		al.clear();
		System.out.println(al);
	}
}
