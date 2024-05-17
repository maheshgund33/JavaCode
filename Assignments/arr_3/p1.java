/*Program 1
Write a program to print count of digits in elements of array.
Input: Enter array elements : 02 255 2 1554
Output: 2 3 1 4
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
			int count=0;
			int temp=arr[i];
			while(temp !=0){
				count++;
				temp=temp/10;
			}
			System.out.println(count);
		}
	}
}








