import java.io.*;

class Arr2{

	public static void main(String args[])throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter array Elements: ");
		int sum=0;
		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}

		System.out.println("Sum of array Elemnts is "+sum);
	}
}
