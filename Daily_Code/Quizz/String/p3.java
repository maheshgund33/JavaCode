class Demo{

	public static void main(String args[]){

		StringBuilder str1=new StringBuilder ("Builder");
		//StringBuffer str2=new StringBuffer(str1.substring(6));
		
		str1.insert(5,new String("0"));

		str1.reverse();
		System.out.println(str1.reverse());
	}
}
