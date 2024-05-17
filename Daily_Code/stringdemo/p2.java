class Stringdemo{

	public static void main(String args []){

		String str1="Core2web";   //String constant pool (scp)
		String str2=new String("Core2Web");   //heap
		String str3="Core2web";  //scp
		String str4=new String("Core2web");//heap
		System.out.println(System.identityHashCode(str1));//0x100
		System.out.println(System.identityHashCode(str2));//0x200
		System.out.println(System.identityHashCode(str3));//0x100
		System.out.println(System.identityHashCode(str4));//0x300
	}
}

