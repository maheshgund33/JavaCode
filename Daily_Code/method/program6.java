/*program6.java:11: error: incompatible types: possible lossy conversion from float to int
		obj.fun(10f);
		        ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/

class Demo{

	void fun(int x){

		System.out.println(x);
	}
	public static void main( String args[]){
		Demo obj=new Demo();
		obj.fun(10f);
	}
}
