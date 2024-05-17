
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
		System.out.println("Enter Search Element= ");
		int flag =0; 
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				flag=1;
				System.out.println("Element Found at index= "+i);
			}
		}
		if(flag==0){
			System.out.println("No Search Found");
		}

	}
}
