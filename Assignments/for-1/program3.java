//count digit
class program3{
        
        public static void main(String args[]){
                int N=653124;
		int count=0;
                for(int i=N;i>0;i=i/10){
                        count++;
                }
	
		System.out.println("Count of digit is: "+count);
        }
}       

