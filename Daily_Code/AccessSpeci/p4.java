//static variable abd static methods

class StaticDemo{

	static int x=10;
	static int y=20;
	static void display(){
		System.out.println(x);
		System.out.println(y);
	}	
}

class Client{
	public static void main(String [] args){
		
		System.out.println(StaticDemo.x);
		System.out.println(StaticDemo.y);
		
		StaticDemo.display();
	}
}
