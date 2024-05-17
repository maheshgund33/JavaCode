import java.io.*;

class InputArray{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter array size= ");

		int size=Integer.parseInt(br.readLine());

		float arr[]=new float[size];
		
		System.out.println("Enter Array Elements: ");

		for(int i=0;i<arr.length;i++){

			arr[i]=Float.parseFloat(br.readLine());
		}

		System.out.println("Print array:");

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}


