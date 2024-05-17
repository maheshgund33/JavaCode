//vector
//

import java.util.*;
class MythreadDemo1 extends Thread{

	public void run(){
		Vector v =new Vector();

		for(int i=0;i<10;i++){
			v.add(i);
			System.out.println("Thread=0");
		}
	}
}
class MythreadDemo2 extends Thread{

	public void run(){
		Vector v =new Vector();

		for(int i=0;i<10;i++){
			v.add(i);
			System.out.println("Thread-1");
		}
	}
}
class VectorDemo{

	public static void main(String [] args){

		MythreadDemo1 obj=new MythreadDemo1();
		MythreadDemo2 obj1=new MythreadDemo2();

		obj.start();
		obj1.start();

	}
}
