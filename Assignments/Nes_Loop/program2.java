/*write a program to print the following pattern
# = = = =
= # = = =
= = # = =
= = = # =
= = = = #
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows:");

		int rows=Integer.parseInt(br.readLine());
		int num=rows;
		int ch=64+rows;

		for(int i=1;i<=rows;i++){

			for(int j=1;j<=rows;j++){

				if(i==j){

					System.out.print("#"+"\t");
				}else{
					System.out.print("="+"\t");
				}
			}
			System.out.println();
		}
	}
}

