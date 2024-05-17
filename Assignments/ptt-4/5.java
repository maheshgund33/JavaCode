/*
 
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		char ch='A';
		char ch1=ch;
		for(int i=1;i<=N;i++){

			if(x==N+1){
				break;
			}else{
				System.out.print(ch1++ +"\t");
				if(N-x+1==i){
					i=0;
					x++;
					ch++;
					ch1=ch;
					System.out.println();
				}
			}
		}
	}
}
