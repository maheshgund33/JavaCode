
import java.io.*;

class Arr2{

	public static void main(String args[])throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array :");
		int size = Integer.parseInt(br.readLine());

		int arr1[]=new int[size];
		int arr2[]=new int [size];

		System.out.println("Enter array1 Elements: ");

		for(int i=0;i<arr1.length;i++){

			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter array2 Elements: ");

		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("UnCommon Elements :");
		for(int i=0;i<arr1.length;i++){
			int flag=0;
			int flag1=0;
			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j]){
					flag=1;
					
				}
				if(arr2[i]==arr1[j]){
					flag1=1;
				}
			}
			if(flag==0){
				System.out.println(arr1[i]);
			}
			if(flag1==0){
				System.out.println(arr2[i]);
			}
		}
	}
}
