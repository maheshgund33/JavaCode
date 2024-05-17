/*
1	
2	3	
4	5	6	
7	8	9	10
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
					System.out.println();
				}
			}
		}
	}
}
