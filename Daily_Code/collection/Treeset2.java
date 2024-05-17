
//TreeSet
//sorted set
//parent is NavigableSet

import java.util.*;

class Cricplayer implements Comparable{
	
	String name=null;
	
	Cricplayer(String name){

		this.name=name;
	}
	public int compareTo(Object o) {
       
       		return name.compareTo(((Cricplayer)o).name);
        }

	public String toString(){

		return name;
	}

}
class TreeSetDemo{
	
	public static void main(String args[]){

		TreeSet ts=new TreeSet();

		ts.add(new Cricplayer("Virat"));
		ts.add(new Cricplayer("Dhoni"));
		ts.add(new Cricplayer("Rohit"));
		ts.add(new Cricplayer("Virat"));

		System.out.println(ts);
	}
}


