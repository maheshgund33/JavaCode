class InterNalArray{

	public static void main(String args []){

		int arr1[]={10,20,300};
		int arr2[]={10,20,300};

		System.out.println(arr1);
		System.out.println(arr2);
		//address
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));
		System.out.println(System.identityHashCode(arr1[2]));
		System.out.println(System.identityHashCode(arr2[2]));
	}
}
