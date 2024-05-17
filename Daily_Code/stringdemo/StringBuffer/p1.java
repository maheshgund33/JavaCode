/* String are Mutabale String
 * can not create new Object on concat
 * Synchronize method-at a time one thread method run
 * String Buffer default size of empty string is 16 character
 */

class String_BufferDemo{

	public static void main(String args[]){

		StringBuffer str=new StringBuffer("Omkar");
		System.out.println(System.identityHashCode(str)); //0x100
		System.out.println(str.capacity()); //16+5=21
		str.append("Walunj111111111111");
		System.out.println(System.identityHashCode(str)); //0x100
		System.out.println(str.capacity());//(21+1)*2=44
	}
}
		

