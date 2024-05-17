//count of odd digit
class program4{
        
        public static void main(String args[]){
                int N=653124;
		int count=0;
                for(int i=N;i>0;i=i/10){
			int rem= N%10;
                        if(rem % 2 !=0)
				count++;
                }
	
		System.out.println("Count of odd digit is: "+count);
        }
}       

