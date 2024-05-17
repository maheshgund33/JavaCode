/*Program 4
WAP to find a prime number from an array and return its index.
Take size and elements from the user
Input: 10 25 36 566 34 53 50 100
Output: prime no 53 found at index: 5
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
			for(int j=1;j<=arr[i]/2;j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			count++;
			if(count==2){
				System.out.print("prime No index is "+i+" ");
			}
		}
		System.out.println();
	}
}



