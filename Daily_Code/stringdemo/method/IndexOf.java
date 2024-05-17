/* method:public int indexOF(int ch,int fromindex);
 *
 * description:finds the first instance of the character in the given String
 *
 * parameter;int ch to find,integer (index to start the search);
 * return type:int
 */
 
class IndexOfdemo{

	public static void main(String args []){

		String str1="Omkar";

		System.out.println(str1.indexOf('k',1)); //2
		System.out.println(str1.indexOf('o',0));  //-1
		System.out.println(str1.indexOf('x',8)); //-1
	}
}
