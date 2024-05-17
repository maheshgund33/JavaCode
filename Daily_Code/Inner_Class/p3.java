//inner class in static
class Outer{

	int x=10;
	static int y=20;

	class Inner{

		final static int y=30;

		void fun2(){

			System.out.println("Fun2-Inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}
	}

	void fun1(){
		System.out.println("Fun1-Inner");
	}
}

class Client{

	public static void main(String [] args){

		Outer obj=new Outer();

		Outer.Inner obj1=obj.new Inner();
		System.out.println(obj1.y);
		System.out.println(obj.new Inner().y);
		System.out.println(Outer.Inner.y);   //not allowed in java 1.8 ver
		obj1.fun2();
       	}
}

