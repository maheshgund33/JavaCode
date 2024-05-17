/*
J
I  H
G  F  E
D  C  B  A
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		char ch='J';
	
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				System.out.print(ch-- +"\t");
				if(x==i){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
