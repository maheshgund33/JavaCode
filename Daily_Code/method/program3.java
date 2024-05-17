
class MethodDemo{


	public static void main( String args[]){

		fun();
		gun();
	}
	static int fun(){
		System.out.println("In fun");
		return 0;
		System.out.println("In fun");   // un reacheable statement
	}
	static void gun(){

		System.out.println("In gun");

	}
}
