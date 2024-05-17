// check palindrom number;

class program10{

	public static void main(String args[]){
		int rev=0;
		int N=653;
		int temp=N;
		for(int i=N;i>0;i=i/10){
			int rem=N %10;
			rev=rev*10+rem;
		}
		if(temp==rev)
			System.out.println("Is pallindrome");
		else
			System.out.println("IS not pallindrome");
	}
}
