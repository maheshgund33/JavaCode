/* 	D4  C3  B2  A1
 *  	A1  B2  C3  D4
 *  	D4  C3  B2  A1
 *  	A1  B2  C3  D4
 *
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

				if(i%2==1){
					System.out.print((char)ch+""+num+"\t");
					ch--;
					num--;
				}else{
					System.out.print((char)ch+""+num+"\t");
					ch++;
					num++;
				}
				
			}
			if(i%2==1){
				num++;
				ch++;
			}else{
				num--;
				ch--;
			}
			System.out.println();
		}
	}
}



