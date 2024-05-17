class TwoDArray{

	public static void main(String args[]){

		int arr[][]=new int [2][3];
		int arr1[][]=new int [2][];
		System.out.println("length of arr1 :"+arr1.length);  //no of rows=2
//		System.out.println("length of arr1[0] :"+arr1[0].length);  //Null pointer exception
		System.out.println("length of arr2[0] :"+arr[0].length);  //no of cols=3
		arr1[0]=new int [3];
		arr1[1]=new int[4];
		int arr2[][]={{1,2,3},{4,5,6}};
		int arr3[][];
		arr3=new int[2][2];
//		arr3[0]={0,0};   //Not allowed
//		arr3[1]={1,1};  //not allowed

//		int arr3[][]=new int [][]{1,2,3,4};  //not allowed

	//	int arr2[][]=new int [][3];  //not allowed
//		int arr1[][]={1,2,3,4,5,6,7,8,9};   Not allowedd
	}
}
