class JaggedArray{

	public static void main(String args[]){

		int arr[][]={{10,20,30},{40,50},{70}};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/* output:
 * 10 20 30
 * 40 50Exeption:ArrayIndexOutofBoundException
 */
