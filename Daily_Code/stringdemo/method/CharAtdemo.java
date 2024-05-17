/*Method:public char charAt(int index);
 * description:It returns the character located at specified index with in the given string
 *
 * parameter:integer(index);
 * return type:Character
 */
class DemoChar{

	public static void main(String [] args){

		String str="Core2Web";

		System.out.println(str.charAt(4));//2
		System.out.println(str.charAt(0));//C
		System.out.println(str.charAt(8));//StringIndexoutofboundsException
	}
}
