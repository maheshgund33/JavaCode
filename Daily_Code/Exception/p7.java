/*Exception in thread "main" java.lang.NumberFormatException: For input string: "Omkar"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at Demo.main(P6.java:9)*/

import java.util.*;
class Demo{


	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("Start code");
		try{
			num=Integer.parseInt(sc.next());
		}catch(ArithmeticException | NumberFormatException obj2){

			System.out.println("In NumberFormat Exception");
		

		}catch(Exception obj){

			System.out.println("In Exception");

		}finally{

			System.out.println("In Finally");
		}
		System.out.println("End code");
	}
}
