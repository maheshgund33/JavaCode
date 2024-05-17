// print reverse of a number;

class program9{

	public static void main(String args[]){
		int rev=0;
		int N=653;
		int temp=N;
		while(N !=0){
			int rem=N %10;
			rev=rev*10+rem;
			N=N/10;
		}
		System.out.println(temp+"rev is:"+rev);
	}
}
