/*Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33
*/

import java.io.*;

class P{

	public static void main(String args [])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number:");

		int num=Integer.parseInt(br.readLine());
		int temp=num;
		int sum=0;

		while(num !=0){

			int rem=num%10;
			int fact=1;

			while(rem !=0){

				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println("Addition of factorials of each digit from "+temp+" :"+sum);
	}
}

