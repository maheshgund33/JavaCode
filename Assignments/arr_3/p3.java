/*Program 3
WAP to find a composite number from an array and return its index.
Take size and elements from the user
Input: 1 2 3 5 6 7
Output: composite 6 found at index: 4
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
			int N=arr[i];
			int count=0;

			for(int j=1;j<=N/2;j++){
				if(N%j==0){
					count++;
				}
				if(count>2){
					System.out.println("index is "+i);
					break;
				}
			}
		}
		System.out.println();
	}
}



