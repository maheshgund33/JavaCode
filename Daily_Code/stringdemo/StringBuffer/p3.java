
class SBDemo{

	public static void main(String args[]){
		String str1="String";
		String str2=new StringBuffer("Bagal");  //Incompatable type:StringBuffer cannot convert
		StringBuffer str3=new StringBuffer("CoreWeb");
		String str4=str1.append(str3);   //String has no append method //cannot find symbol 

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
