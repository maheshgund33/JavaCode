//count of odd digit
class program4{
        
        public static void main(String args[]){
                int N=653124;
		int count=0;
                while(N !=0){
			int rem= N%10;
                        if(rem % 2 !=0)
				count++;
                        N=N/10;
                }
	
		System.out.println("Count of odd digit is: "+count);
        }
}       

