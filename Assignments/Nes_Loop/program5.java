/*write a program to print the following pattern
Row =4
0
1 1
2 3 5
8 13 21 34
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows:");

		int rows=Integer.parseInt(br.readLine());
		int num=rows;
		int a=0;
		int b=1;

		for(int i=1;i<=rows;i++){

			for(int j=1;j<=i;j++){

				System.out.print(a+"\t");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}

