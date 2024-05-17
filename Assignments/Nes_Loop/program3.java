/*write a program to print the following pattern
5 4 3 2 1
8 6 4 2
9 6 3
8 4
5
 
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows:");

		int rows=Integer.parseInt(br.readLine());
		int num=rows;

		for(int i=1;i<=rows;i++){

			for(int j=1;j<=rows-i+1;j++){
				System.out.print(num*i+"\t");
				num--;
			}
			num=rows-i;
			System.out.println();
		}
	}
}

