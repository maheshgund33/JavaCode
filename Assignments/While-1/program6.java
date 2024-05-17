//mult of odd digit and sum of even digit
class program6{
        
        public static void main(String args[]){
                int N=653124;
		int sum=0;
		int mult=1;
                while(N !=0){
			int rem= N%10;
                        if(rem % 2 !=0)
				sum=sum+rem;
			else
				mult=mult*rem;
                        N=N/10;
                }
	
		System.out.println("mult of odd digit is: "+mult);
		System.out.println("sum of even digit is: "+sum);

        }
}       

