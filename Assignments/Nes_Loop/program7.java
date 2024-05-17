/*Q7
write a program to print the following pattern
Row =5;
O
14  13
L   K 	J
9   8   7  6
E   D   C  B  A
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows:");

		int rows=Integer.parseInt(br.readLine());
		int num=(rows*rows+rows)/2;
		int ch=64+num;

		for(int i=1;i<=rows;i++){

			for(int j=1;j<=i;j++){
				if(rows %2==0){

					if(i%2==0){
						System.out.print((char)ch+"\t");
					}else{
						System.out.print(num+"\t");
					}
				}else{
					if(i%2==1){
                                                System.out.print((char)ch+"\t");
                                        }else{
                                                System.out.print(num+"\t");
                                        }
				}

				ch--;
				num--;
			}
			System.out.println();
		}
	}
}


