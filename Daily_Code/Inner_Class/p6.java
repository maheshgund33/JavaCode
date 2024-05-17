//Anonymous Inner class

class Demo{

	void marry(){

		System.out.println("Kriti sanon");
	}
}

class Client{

	public static void main(String [] args){

		Client obj=new Client(){

			final static int a=20;
			Client marry(){
				System.out.println("Disha Patni");
				return new Client(){
					int b=35;
				};
			}

			Client fun(){
				System.out.println("In fun");
				return new Client();
			}

			class Inner{
				int m;
			}

		}.marry();
	
	}
}
