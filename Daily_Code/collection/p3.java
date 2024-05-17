//sort arrayList with out using arrayList contains user defined object

import java.util.*;


class Employee implements Comparator{

	String empName=null;
	int empid=0;

	Employee(String empName,int empid){

		this.empName=empName;
		this.empid=empid;
	}
	
	Employee(){

		return;
	}
	public String toString(){

		return empName+":"+empid;
	}

	public int compare(Object obj1,Object obj2){

		return (((Employee)obj1).empName).compareTo(((Employee)obj2).empName);
	}

}
class SortListDemo{

	public static void main(String [] args){

		ArrayList al=new ArrayList();

		al.add(new Employee("Kanah",10));
		al.add(new Employee("Ashish",20));
		al.add(new Employee("Rahul",5));
		//al.add("Badhe");

		System.out.println(al);

		Collections.sort(al,new Employee(){
			public int compare(Object obj1,Object obj2){

				return (((Employee)obj1).empName).compareTo(((Employee)obj2).empName);
			}
		});

		System.out.println(al);

	}
}
