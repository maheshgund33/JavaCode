/*
9
9  8
9  8  7
9  8  7  6
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=9;
	
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				System.out.print(num-- +"\t");
				if(x==i){
					i=0;
					num=9;
					x++;
					System.out.println();
				}
			}
		}
	}
}
