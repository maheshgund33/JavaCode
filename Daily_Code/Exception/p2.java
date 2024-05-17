//defaltException Handler
//ArrayIndexOutOfBoundException 
//Runtime:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at Demo.main(p2.java:11)



class Demo{

	public static void main(String [] args){

		int arr[]=new int[5];
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
		}

		for(int x:arr){
			System.out.println(x);
		}
	}
}


