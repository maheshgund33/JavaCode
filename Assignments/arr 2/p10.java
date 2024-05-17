
import java.io.*;

class Arr2{

	public static void main(String args[])throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter array Elements: ");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Even digit sum : ");
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int sum=0;
			while(temp !=0){
				int rem=temp %10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum %2==0){
				System.out.println(arr[i]);
			}	
		}
	}
}
