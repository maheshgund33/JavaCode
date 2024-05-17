class demo{
	public static void main(String args[]){

		int x=10;
		{	
			int x=15;
			System.out.println(x);  //error
		}
		{
			int x=20;
			System.out.println(x); //error
		}
		{
			System.out.println(x);
		}
	}
}
		

