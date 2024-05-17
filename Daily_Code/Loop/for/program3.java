// composite No

class Composite{

	public static void main (String args[]){
		

		int N=6;
		int count=0;

		for(int i=1;i<=N/2;i++){
			if(N%i==0){
				count++;
			}
			if(count>2){
				System.out.println("Composite No");
				break;
			}
		}
		count++;
		if(count==0){
			System.out.println("Not prime ,not composite");
		}
		if(count==2){
			System.out.println("Not composite no");
		}
	}
}
