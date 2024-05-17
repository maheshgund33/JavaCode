/*
10
I   h
7   6   5
D   C   B   A
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=(N*N+N)/2;
		char ch='J';
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				if(x%2==0){
					System.out.print(ch +"\t");
					
				}else{
					System.out.print(num + "\t");
				}
				num--;
				ch--;
				if(x==i){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
