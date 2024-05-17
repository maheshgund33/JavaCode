/*method: public String substring(int index);
 * description:substring index of the String to end
 * parameter ;int (index of the string);
 * return type: string
 */

class SubStringDemo{

	public static void main( String args[]){

		String str="Core2web Tech";
		System.out.println(str.substring(5));  //web Tech
		System.out.println(str.substring(0,3));  //cor
		System.out.println(str.substring(16));  //Exception
		System.out.println(str.substring(0,14));  //Exception
	}
}

