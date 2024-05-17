class JaggedArray{

	public static void main(String ...args){

		int arr[][]={{1,2,3},{4,5},{7}};
		int arr1[][]=new int[3][];
		int[] arr3[],arr7;

		arr1[0]=new int[]{1,2,3};
		arr1[1]=new int[]{4,5};
		arr1[2]=new int[]{7};
//		arr1[3]=new int[]{2};

//		System.out.println("length of arr1 :"+arr1.length);  //array index out of bound index 3
		int arr2[][]=new int[3][];

		int arr4[]={1,2,2};
		int arr5[]={4,5};
		int arr6[]={7};

		arr[0]=arr4;
		arr[1]=arr5;
		arr[2]=arr5;
	}
}
