//Iterator


import java.util.*;

class IteratorDemo{

	public static void main(String [] args){
		
		ArrayList al=new ArrayList();

		al.add("Kanha");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr=al.iterator();

		while(itr.hasNext()){

			try{
				System.out.println(itr.next());
				if("Rahul".equals(itr.next())){
					itr.remove();
				}
			}catch(NoSuchElementException obj){

			}
			
		}
		System.out.println(al);
	}
}
