/*
1	2	3	
3       4
4
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
				if(i==N-x+1){
					i=0;
					x++;
					num--;
					System.out.println();
				}
			}
		}
	}
}
