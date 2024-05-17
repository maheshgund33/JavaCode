// print reverse of a number;

class program9{

	public static void main(String args[]){
		int rev=0;
		int N=653;
		int temp=N;
		for(int i=N;i>0;i=i/10){
			int rem=N %10;
			rev=rev*10+rem;
		}
		System.out.println(temp+"rev is:"+rev);
	}
}
