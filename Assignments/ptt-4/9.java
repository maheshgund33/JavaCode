/*
1
8	9		
27	64	125
64	25	216	49	

*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=1;
		for(int i=1;i<=N;i++){

			if(x==N+1){
				break;
			}else{
				if(i%2==0){
					System.out.print(num*num +"\t");
				}else{
					System.out.print(num*num*num+"\t");
				}
				num++;
				if(x==i){
					i=0;
					x++;
					num=x;
					System.out.println();
				}
			}
		}
	}
}
