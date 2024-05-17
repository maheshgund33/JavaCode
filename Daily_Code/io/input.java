/* take input from user at time enter farm location ,enter section,enter ekers,enter price */


import java.io.*;
import java.util.*;

class ABC{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Farm Location,section,ekers,price");

		String info=br.readLine();

		StringTokenizer obj=new StringTokenizer(info," ");

		String token1=obj.nextToken();
		char token2=obj.nextToken().charAt(0);
		int token3=Integer.parseInt(obj.nextToken());
		float token4=Float.parseFloat(obj.nextToken());

		System.out.println("Farm Location = "+token1);
		System.out.println("Farm Section = "+token2);
		System.out.println("Farm ekers = "+token3);
		System.out.println("Farm price = "+token4);

		
	}
}
