/*
 * Program 5
WAP to find a Perfect number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 496 564
Output: Perfect no 496 found at index: 3
*/


import java.io.*;

class Arr3{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}

		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int sum=0;

			for(int j=1;j<=N/2;j++){
				if(N%j==0){
					sum=sum+j;
				}
			}
			if(sum==N){
				System.out.println("Is Perfect no index : "+i);
			}

		}
		
	}
}



