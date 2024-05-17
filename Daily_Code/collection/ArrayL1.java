//ArrayList in for loop

import java.util.*;

class ArrayListDemo1{

	public static void main(String [] args){

		ArrayList al=new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);

		System.out.println(al);
		
		//for each loop
		for(var obj1:al){
			System.out.println(obj1);
		}

		//for loop
		
		System.out.println("In For Loop");
		for(int i=0;i<al.size();i++){

			System.out.println(al.get(i));
		}
	}
}

