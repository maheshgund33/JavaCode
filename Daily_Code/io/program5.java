/* dynamic stringTokenizer */

import java.io.*;
import java.util.*;

class demo{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("ENter flat NO,wings,socity,price:");

		String info=br.readLine();

		StringTokenizer stc =new StringTokenizer(info," ");

		System.out.println("Token count is : "+stc.countTokens());

		while(stc.hasMoreTokens()){

			System.out.println(stc.nextToken());
		}
	}
}
