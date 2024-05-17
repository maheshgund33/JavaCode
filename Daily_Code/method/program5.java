/*  error:method fun() in class Demo cannot be applied to given type
 *  			obj.fun);
 *  			   ^
 *  required:int
 *  found : no argument
 *  reason: actual and formal argument lists differ in length
 */

class Demo{

	void fun(int x){

		System.out.println(x);
	}
	public static void main( String args[]){
		Demo obj=new Demo();
		obj.fun();
	}
}
