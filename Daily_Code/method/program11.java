

class Demo{

	int fun(int x){

		System.out.println(x);
		return x,1;//; expected
	}
	public static void main( String args[]){
		Demo obj=new Demo();
		int a=obj.fun(10);
		System.out.println(a);
	}
}
