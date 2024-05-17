/*
C2W
C2W	C2W
C2W	C2W	C2W
C2W	C2W	C2W	C2W
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		for(int i=1;i<=N;i++){

			if(x==N+1){
				break;
			}else{
				System.out.print("C2W"+"\t");
				if(x==i){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
