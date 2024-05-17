//Instance variable solution
class Instance_var{
	static int x=10;
	public static void main(String args[]){
		int y=20;
		System.out.println(x);
		System.out.println(y);
	}
}
//Solution:-
/*program11.java:6: error: non-static variable x cannot be referenced from a static context
 *                 System.out.println(x);
 *                                    ^
 *                 1 error
 */
		
