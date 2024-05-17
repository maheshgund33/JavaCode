

class Demo{

	void fun(float x){
		System.out.println("In fun");
		System.out.println(x);
	}
	public static void main( String args[]){
		Demo obj=new Demo();
		obj.fun(10); //10.0
		obj.fun(10f); //10.5
		obj.fun('A'); //65.0
	}
}
