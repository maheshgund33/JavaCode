/*
10	
10	9	
9	8	7	
7	6	5	4
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=(N*N+N)/2;
		for(int i=1;i<=N;i++){

			if(x==N+1){
				break;
			}else{
				System.out.print(num-- +"\t");
				if(x==i){
					i=0;
					x++;
					num++;
					System.out.println();
				}
			}
		}
	}
}
