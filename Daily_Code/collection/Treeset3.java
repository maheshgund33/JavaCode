//real Time


import java.util.*;

class  Taluka implements Comparable{ 

	String name=null;
	int NoVill=0;

	Taluka(String name,int NoVill){

		this.name=name;
		this.NoVill=NoVill;

	}

	public int compareTo(Object obj){

		//return name.compareTo(((Taluka)obj).name);     //assending
		//return -(name.compareTo(((Taluka)obj).name));    //desending
		return NoVill-((Taluka)obj).NoVill;            //Sort by Village
	}

	public String toString(){

		return name+":"+NoVill;
	}

}

class Client{

	public static void main(String [] args){

		TreeSet ts=new TreeSet();

		ts.add(new Taluka("Parner",131));
		ts.add(new Taluka("Sangamner",170));
		ts.add(new Taluka("Nagar",106));
		ts.add(new Taluka("Shrigonda",114));
		ts.add(new Taluka("Parner",131));

		System.out.println(ts);
	}
}
