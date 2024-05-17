/*
F
E  F
D  E  F
C  D  E  F
B  C  D  E  F
A  B  C  D  E  F
*/
class ptt{
	
	public static void main(String args[]){

		int N=6;
		int x=1;
		char ch='F';
		char ch1=ch;
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				System.out.print(ch1 +"\t");
				ch1++;
				if(x==i){
					i=0;
					x++;
					ch--;
					ch1=ch;
					System.out.println();
				}
			}
		}
	}
}
