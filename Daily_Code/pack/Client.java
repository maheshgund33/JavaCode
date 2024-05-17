
import arithfun.Multiplication;
import arithfun.division.Division;

class Client{

	public static void main(String [] args){

		Multiplication obj=new Multiplication(10,20);

		System.out.println(obj.multi());
		Division obj1=new Division(25,5);
		System.out.println(obj1.div());
	}
}
