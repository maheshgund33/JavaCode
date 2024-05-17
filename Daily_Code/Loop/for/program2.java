//amstrong  no

class amstrong_no{

	public static void main(String args[]){

		int N=23;
		int sum=0;
		int count=0;
		for(int i=N;i>0;i=i/10){
			count++;
		}
		for(int i=N;i>0;i=i/10){
			int rem=i%10;
			int mult=1;
			for(int j=0;j<count;j++){
				mult=mult*rem;
			}
			sum=sum+mult;
		}

		if(sum==N){
			System.out.println("Is amstrong no");
		}else{
			System.out.println("Is Not a amstrong No");
		}

	}
}


