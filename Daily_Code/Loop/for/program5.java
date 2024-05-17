//Strong Number

class Strong{

	public static void main(String args[]){

		int N=145;
		int sum=0;

		for(int i=N;i>0;i=i/10){
			int rem=i%10;
			int fact=1;
			for(int j=rem;j>0;j--){
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(sum==N){
			System.out.println("Is strong number");
		}else{
			System.out.println("Is not strong Number");
		}
	}
}

