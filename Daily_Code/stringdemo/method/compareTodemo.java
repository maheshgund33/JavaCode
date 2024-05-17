/* method:public static int compareTo(String str2);
 *
 * description:
 * It compare the Str1 and atr2(case Sensative)
 * If both the Sting are equal it return 0 otherwise return the comparison //differnce
 * ex.str1.compareTo(str2);
 * parameter   :string(Second String);
 * return Type:Integer
 */

class CompareToDemo{

	public static void main(String [] args){
		String str1="Ashish";
		String str2="ashish";

		System.out.println(str1.compareTo(str2)); //32
	}
}
