//Arithmatic Exception:Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Demo.main(p3.java:7)


class Demo{
	public static void main(String [] args){

		System.out.println("start");
		int x=0;
		try{
			x=10/0;
		}catch(ArithmeticException obj){

			System.out.println(obj);
			System.out.println(obj.toString());
			System.out.println(obj.getMessage());
			obj.printStackTrace();
		}
		System.out.println("End");
	}
}
