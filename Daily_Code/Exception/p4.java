//NULLPOINTER Exception:Exception in thread "main" java.lang.NullPointerException
//	at Demo.main(p3.java:7)

class Demo1{

	void m1(){

	}
}
class Demo{

	public static void main(String [] args){
		Demo1 obj=new Demo1();

		obj=null;
		obj.m1();
		
	}
}
