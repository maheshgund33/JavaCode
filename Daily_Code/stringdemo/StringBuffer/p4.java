
class SBDemo{

	public static void main(String args[]){
		String str1="Shashi";
		String str2=new String("Bagal"); 
		StringBuffer str3=new StringBuffer("Core2Web");
		System.out.println(System.identityHashCode(str3)); //0x100
		StringBuffer str4=str3.append(str2);   

		System.out.println(str1);//Shashi
		System.out.println(str2);//Bagal
		System.out.println(str3);//Core2webBagal
		System.out.println(System.identityHashCode(str3)); //0x100
		System.out.println(str4);//Core2webBagal
	}
}
