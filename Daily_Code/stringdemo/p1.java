class Stringdemo{

	public static void main(String args []){

		String str1="Core2web";   //String constant pool (scp)
		String str2=new String("Core2Web");   //heap
		char str3[]={'c','2','w'};  //heap

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}

