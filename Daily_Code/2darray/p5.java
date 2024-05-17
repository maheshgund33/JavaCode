import java.util.*;

class Input2Darray{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter No Rows in Array:");
		int rows=sc.nextInt();
		int arr[][]=new int[rows][];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter cols in "+i+"th row:");
			int size=sc.nextInt();
			arr[i]=new int[size];
		}
		System.out.println("Enter array Elements:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		//for each loop in 2d

		for(int[] x:arr){
			for(int y:x){
				System.out.print(y+" ");  
			}
			System.out.println();
		}
	}
}
