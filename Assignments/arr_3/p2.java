/*Program 2
WAP to reverse each element in an array.
Take size and elements from the user
Input: 10 25 252 36 564
Output: 01 52 252 63 465
*/

import java.io.*;

class Arr3{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}

		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int rev=0;
			while(temp !=0){
				int rem=temp %10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			System.out.print(rev +" ");
		}
		System.out.println();
	}
}








