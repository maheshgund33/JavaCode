//
//LinkedList in UserDefind object

import java.util.*;

class CricPlayer{

	int jerNo=0;
	String name=null;

	CricPlayer(int jerNo,String name){

		this.jerNo=jerNo;
		this.name=name;
	}

	public String toString(){

		return jerNo +":"+name;
	}
}

class LinkedListDemo{
	
	public static void main(String [] args ){
		LinkedList ll=new LinkedList();

		ll.add(new CricPlayer(18,"Virat"));
		ll.add(new CricPlayer(7,"Dhoni"));
		ll.add(new CricPlayer(45,"Rohit"));
		System.out.println(ll);
		ll.add(2,new CricPlayer(33,"Pandya"));
		System.out.println(ll);

		// E getFirst();
		System.out.println(ll.getFirst());     //18:virat
		
		//E getLast()
		System.out.println(ll.getLast());     //45:Rohit

		//E removeFirst();

		System.out.println(ll.removeFirst());     //18:virat
		
		//E removeLast();
		System.out.println(ll.removeLast());     //45:Rohit
		
		//void addFirst(E)
		ll.addFirst(new CricPlayer(18,"virat"));     
		
		//void addLast(E)
		ll.addLast(new CricPlayer(12,"Sachin"));     

		System.out.println(ll);


	}
}

		
