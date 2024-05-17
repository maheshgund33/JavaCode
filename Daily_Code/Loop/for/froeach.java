class foreach{

	public static void main(String args[]){

		int arr[]={10,20,30,40};
		int arr1[]={1,2,3,4,5,6};

		for(int x:arr1){
			if(x%2==0){
				System.out.println(x);
			}
		}
	}
}
