//IoException 
//Compile Time: unreported Exception IOException: must be caught or declacre to be thrown 

import java.io.*;
class Demo{

	public static void main(String [] args){

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println(br.readLine());
	}
}


