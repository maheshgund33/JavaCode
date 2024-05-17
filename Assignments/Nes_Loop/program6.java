/*Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}
Input: a p
Output: The difference between a and p is 15
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter character1:");

		char ch1=(char)br.read();
		br.skip(1);
		System.out.println("Enter character2:");
		char ch2=(char)br.read();

		if(ch1==ch2){
			System.out.println(ch1);
		}else{
			System.out.println(ch2-ch1);
		}
	}
}


