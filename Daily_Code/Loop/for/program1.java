//perfect no

class perfect_no{

	public static void main(String args[]){

		int N=6;
		int sum=0;
		
		for(int i=1;i<=N/2;i++){
			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println("Is Perfect no");
		}else{
			System.out.println("Is Not a perfect No");
		}

	}
}


