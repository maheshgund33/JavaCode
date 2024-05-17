class demo{
	public static void main(String args[]){

		int x=10;
		{	
			int y=20;	
			System.out.println(x+" "+y);  //10,20 
		}
		{
			int y=15;
			System.out.println(x+" "+y); //error
		}
		System.out.println(x+" "+y);//error
	}
}
		

