//User Defined class

import java.util.*;

class Platform implements Comparable{

	String str=null;
	int FoundYear=0;

	Platform (String str,int FoundYear){
		this.str=str;
		this.FoundYear=FoundYear;
	}
	public String toString(){
		return "{"+str+":"+FoundYear +"}";
	}
	public int compareTo(Object obj){

		return this.str.compareTo(((Platform)obj).str);
	}

}

class TreemapDemo{

	public static void main(String [] args){

		TreeMap tm=new TreeMap();

		tm.put(new Platform("YouTube",2005),"GOOGLE");
		tm.put(new Platform("FaceBook",2004),"META");
		tm.put(new Platform("Instagram",2010),"META");
		tm.put(new Platform("ChatGpt",2022),"OPENAI");

		System.out.println(tm);
	}
}

