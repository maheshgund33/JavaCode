//data type sol
class Data_type1{

	public static void main(String args[]){ 
		byte val1=18;
		byte val2=18;
		int val3=val1+val2;
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}
}
//solution :
/*program7.java:7: error: incompatible types: possible lossy conversion from int to byte
 *                 val1=val1+val2;
 *                                          ^
 *                                          1 error*/

