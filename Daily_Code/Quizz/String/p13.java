class Demo{

	public static void main(String args []){
		
		StringBuffer s1=new StringBuffer ("core2web");
		long  s2=System.identityHashCode (s1);
		s1.append("technologies");
		long  s3=System.identityHashCode (s1);

		if(s2==s3)
			System.out.println("T");
		else
			System.out.println("F");
			
			
		
	}
	
}
