/*
C2W10
C2W9	C2W8
C2W7	C2W6	C2W5
C2W4	C2W3	C2W2	C2W1
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
				System.out.print("C2W"+""+num-- +"\t");
				if(x==i){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
