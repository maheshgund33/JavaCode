/*program9.java:11: error: 'void' type not allowed here
		System.out.println(obj.fun(10));
		                          ^
1 error
*/

class Demo{

	void fun(int x){

		System.out.println(x);
	}
	public static void main( String args[]){
		Demo obj=new Demo();
		System.out.println(obj.fun(10));
	}
}
