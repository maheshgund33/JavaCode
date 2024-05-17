class Stringdemo{

	public static void main(String args []){

		String str1=new String("Core2Web");  
		String str2=new String("Core2web");
		
		if(str1==str2){
			System.out.println("True");
		}
		if(str1.equals(str2)){
			System.out.println("Equal True");
		}
		if(str1.hashCode()==str2.hashCode()){
			System.out.println(" Hash Equal True");
		}

	}
}

