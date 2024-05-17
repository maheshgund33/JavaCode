class Stringdemo{

	public static void main(String args []){

		String str1=new String("Shashi");  
		String str2=new String("Bagal");
		String str3="Tejas";
		String str4="Core2web";
		String str5=str3+str4;	
		String str6=str1.concat(str2);
		
		System.out.println(str5);
		System.out.println(str1.hashCode());
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

