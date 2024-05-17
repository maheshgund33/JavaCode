/*Program 2
WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
output : 40
// 2 * 2 * 10
*/

import java.io.*;

class Arr_1{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		int product=1;
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i] % 2 ==0){

				product =product*arr[i];
			}
		}

		System.out.println("product of even Number is "+product);
	}
}








