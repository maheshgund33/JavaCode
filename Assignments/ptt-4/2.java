/*
1	
3	4	
6	7	8	
10	11	12	13	
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
				System.out.print(num++ +"\t");
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
