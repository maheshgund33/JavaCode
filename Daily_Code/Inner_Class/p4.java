//Anonymous Inner class

class Demo{

	void marry(){

		System.out.println("Kriti sanon");
	}
}

class Client{

	public static void main(String [] args){

		Demo obj=new Demo(){

			void marry(){
				System.out.println("Disha Patni");
			}
		};
		obj.marry();  // Disha Patni
	}
}
