class ArrayDemo{

	public static void main(String args[]){

		int arr1[]={10,20,30,40,50};
		char arr2[]={'A','B','C'};
		float arr3[]={10.5f,15f,6.2f};
		boolean arr4[]={true,false,true};

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		//char
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		//float
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);  //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

		//boolean

		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
	}
}

