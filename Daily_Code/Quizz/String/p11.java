class Demo{

	public static void main(String args []){
		
		StringBuffer s1=new StringBuffer (400);
		s1.append("Java_Developement_Kit");
		s1.trimToSize();
		s1.setLength(10);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
			
		
	}
	
}
