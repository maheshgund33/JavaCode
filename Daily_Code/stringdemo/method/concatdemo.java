/* method:- public String concat(String str);
 * description:
 * -concatinate string to this i.e Another string is concatinated with the first string
 * -Implement new array of character whose length is sum of str1.length and str2.length
 *
 *  parameter:string
 *  return type:String
 */

class ConcatDemo{

	public static void main(String args []){

		String str1="Core2";
		String str2="Web";
		String str3=str1.concat(str2);  //Core2Web

		System.out.println(str3);
	}
}
