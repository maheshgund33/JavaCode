class Stringdemo{

	public static void main(String args []){

		String str1=new String("Core2");  
		String str2=new String("web");
		String str3="Tejas";
		String str4="Core2web";
		String str5=str1+str2;	
		
		System.out.println(str5);
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	
		/*
		if(str4==str3){
			System.out.println("True");
		}
		if(str1.equals(str3)){
			System.out.println("Equal True");
		}
		if(str1.hashCode()==str3.hashCode()){
			System.out.println(" Hash Equal True");
		}
		*/

	}
}

