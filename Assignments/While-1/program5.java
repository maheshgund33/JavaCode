//even digit square
class program5{
        
        public static void main(String args[]){
                int N=653124;
                while(N !=0){
			int rem= N%10;
                        if(rem % 2 ==0)
				System.out.println(rem*rem);
                        N=N/10;
                }
        }
}       

