//count digit
class program3{
        
        public static void main(String args[]){
                int N=653124;
		int count=0;
                while(N !=0){
                        count++;
                        N=N/10;
                }
	
		System.out.println("Count of digit is: "+count);
        }
}       

