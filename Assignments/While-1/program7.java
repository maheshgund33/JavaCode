//if Number is even print reverse and if number is odd then order reverse difference is 2
class program7{
        
        public static void main(String args[]){
                int N=15;
                if(N % 2==0){
			while(N>0){
				System.out.println(N);
				N--;
			}
		}else{
			while(N>0){
				System.out.println(N);
				N=N-2;
			}
		}
        }
}       

