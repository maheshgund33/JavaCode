//User Defined class  using comparator

import java.util.*;

class Platform {

	String str=null;
	int FoundYear=0;

	Platform (String str,int FoundYear){
		this.str=str;
		this.FoundYear=FoundYear;
	}
	public String toString(){

		return "{"+str+":"+FoundYear+"}";
	}

}
class SORTbyName implements Comparator{
	public int compare(Object obj1,Object obj2){
	       return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}	
class TreemapDemo{

	public static void main(String [] args){

		TreeMap tm=new TreeMap(new SORTbyName());

		tm.put(new Platform("YouTube",2005),"GOOGLE");
		tm.put(new Platform("FaceBook",2004),"META");
		tm.put(new Platform("Instagram",2010),"META");
		tm.put(new Platform("ChatGpt",2022),"OPENAI");

		System.out.println(tm);
	}
}

