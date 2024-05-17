/*  error: Non static method gun() cannot be referenced from static context */

class MethodDemo{


	public static void main( String args[]){

		fun();
		gun();
	}
	static void fun(){

		System.out.println("In fun");

	}
	void gun(){

		System.out.println("In gun");

	}
}
