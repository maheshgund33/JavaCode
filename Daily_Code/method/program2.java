/*  o/p: 
In fun
In fun x: 10
In fun y: 20
In gun
In fun x: 10
In fun y: 20
In main x: 10
In main y: 20

*/

class MethodDemo{
	int x=10;
	static int y=20;
	public static void main( String args[]){

		fun();
		MethodDemo obj=new  MethodDemo();
		obj.gun();
		System.out.println("In main x: "+obj.x );
		System.out.println("In main y: "+y);
	}
	static void fun(){

		System.out.println("In fun");
		MethodDemo obj=new MethodDemo();
		System.out.println("In fun x: "+obj.x); 
		System.out.println("In fun y: "+y); //only static variablle are allowed

	}
	void gun(){

		System.out.println("In gun");
		System.out.println("In fun x: "+x);// allowed static and non static variable in non static method  
		System.out.println("In fun y: "+y);// when create class obj

	}
}
