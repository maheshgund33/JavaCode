// Bitwise Opearator( & | ^ << >> >>> ~)

class Bitwise{

	public static void main(String args[]){

		int x=9;
		int y=14;

		System.out.println(x & y);  //8
		System.out.println(x | y);  //10 
		System.out.println(x ^ y);  //2
		x=8;
		y=10;
		System.out.println(x << 2);  //32
		System.out.println(y>> 2);   //2
		System.out.println(x >>> 2);  //2
		x=-7;
		System.out.println(x >>> 31); //1
	}
}
