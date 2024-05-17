/*write a program to print the following pattern
Row =8
$
@ @
& & &
# # # #
$ $ $ $ $
@ @ @ @ @ @
& & & & & & &
# # # # # # # #

*/
import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows:");

		int rows=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=rows;i++){

			for(int j=1;j<=i;j++){

				if(i %4 == 1){
					System.out.print("$"+"\t");
				}else if(i %4 ==2){
					System.out.print("@"+"\t");
				}else if(i%4==3){
					System.out.print("&"+"\t");
				}else{
					System.out.print("#"+"\t");
				}
			}
			System.out.println();
		}
	}
}

