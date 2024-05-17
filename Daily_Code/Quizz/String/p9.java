class Demo{

	public static void main(String args[]){

		StringBuilder str1=new StringBuilder ("Shashi");
//		StringBuffer str2=new StringBuffer(str1.substring(6));
		str1.replace(0,1,"P");
		System.out.println(str1);
	}
}
