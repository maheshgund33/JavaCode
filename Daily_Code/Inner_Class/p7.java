// Method local Inner class
class Outer{
	void m1(){
		int x=10;
		System.out.println("In m1 Outer");
		class Inner {

			void Innerm1(){
				System.out.println("In m1 Inner");
				System.out.println(x);
			}

		}
		Inner obj=new Inner();
		obj.Innerm1();
	}
}

class Client{

	public static void main(String [] args){

		Outer obj=new Outer();

		obj.m1();
	}
}


