/*
2  3  5  7
11 13 17 19
23 29 31 37
41 43 47 53
*/
class ptt{
	
	public static void main(String args[]){

		int N=4;
		int x=1;
		int num=2;
		for(int i=1;i<=N;i++){

			if(x==N+1){
				break;
			}else{
				int count=0;
				for(int j=1;j<=num;j++){
					if(num %j==0){
						count++;
					}
					if(count>2){
						count=0;
						j=0;
						num++;
					}
				}
				if(count==2){
					System.out.print(num++ +"\t");
				}

				if(i==N){
					i=0;
					x++;
					System.out.println();
				}
			}
		}
	}
}
