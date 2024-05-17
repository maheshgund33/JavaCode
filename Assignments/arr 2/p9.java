
import java.io.*;

class Arr2{

	public static void main(String args[])throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr1[]=new int[size];
		int arr2[]=new int [size];

		System.out.println("Enter array2 Elements: ");

		for(int i=0;i<arr1.length;i++){

			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter array2 Elements: ");

		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("Merge array:");

		int arr3[]=new int [arr1.length+arr2.length];
		int itr=0;
		for(int i=0;i<arr1.length;i++){
			arr3[itr]=arr1[i];
			System.out.print(arr3[itr]+" ");
			itr++;
		}
		for(int i=0;i<arr2.length;i++){
			arr3[itr]=arr2[i];
			System.out.print(arr3[itr]+" ");
			itr++;
		}
		System.out.println();
		
	}
}
