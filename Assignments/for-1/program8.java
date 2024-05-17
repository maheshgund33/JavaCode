// countdown of days to submit assignment
class program8{
        
        public static void main(String args[]){
                int N=15;
		for(int i=N;i>=0;i--){
			if(N==0)
				System.out.println(N+" days assignment to overdue");
			else
				System.out.println(N+" days remaining");
		}
        }
}       

