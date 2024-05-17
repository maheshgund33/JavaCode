/*method:public boolean equals(object anObject);
 * description: predict Which compares and object to this .This is true only for string with the same character sequence
 * return true if anObject is Semantically equal to this parameter :object (anobject);
 * returnType:boolean
 */

class Isequals{

	public static void main(String args []){

		String str1="Core2Web";
		String str2=new String("Core2Web");
		System.out.println(str1.equals(str2));//true
	}
}
