// print all its digit;

class digit{

	public static void main(String args[]){
		int N=653;
		while(N !=0){
			int rem=N %10;
			System.out.print(rem+" ");
			N=N/10;
		}
		System.out.println(" ");
	}

	//System.out.println(" ");
}
