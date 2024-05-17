//cursor
import java.util.*;

class CursorDemo{

	public static void main(String args[]){

		Vector v1=new Vector();
		ArrayList v=new ArrayList();

		v.add("Kanaha");
		v.add("Rahul");
		v.add("Ashish");
		v.add("Badhe");

		for(var x:v){

			System.out.println(x.getClass().getName());
		}

		Iterator cursor=v.iterator();

		while(cursor.hasNext()){

			if("Rahul".equals(cursor.next())){

				cursor.remove();
			}
		}
		System.out.println(v);

		//ListIterator
		ListIterator litr=v.listIterator();

		while(litr.hasNext()){

			System.out.println(litr.next());
		}
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
		//Enumeration

		Enumeration cursor1=v1.elements();

		System.out.println(cursor1.getClass().getName());

		while(cursor1.hasMoreElements()){

			System.out.println(cursor1.nextElement());
		}


	}
}

