/*
F
E  1
D  2  F
C  3  E  4
B  5  D  6  F
A  7  C  8  E  9
*/
class ptt{
	
	public static void main(String args[]){

		int N=6;
		int x=1;
		char ch='F';
		int num=1;
		char ch1=ch;
		for(int i=1;i<=N;i++){
			if(x==N+1){
				break;
			}else{
				if(i%2==1){
					System.out.print(ch1 +"\t");
					ch1++;
				}else{
					System.out.print(num++ + "\t");
				}
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
