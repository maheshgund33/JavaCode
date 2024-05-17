/* method:public int lastIndexOF(int ch,int uptoindex);
 *
 * description:finds the last instance of the character in the given String
 *
 * parameter;int ch to find,integer (index to start the search from right left);
 * return type:int
 */
 
class LastIndexOfdemo{

	public static void main(String args []){

		String str1="Omkar";

		System.out.println(str1.lastIndexOf('k',1)); //-1
		System.out.println(str1.lastIndexOf('o',0));  //-1
		System.out.println(str1.lastIndexOf('k',8)); //2
	}
}
