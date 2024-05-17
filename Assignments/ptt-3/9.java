/*
1
8  27
64 125  216
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=1;;
	
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				System.out.print(num*num*num +"\t");
				num++;
				if(x==i){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
