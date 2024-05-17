//automorphic No

class Automorphic{

	public static void main(String args[]){

		int n=25;
		int sqr=n*n;
		int mult=1;
		for(int i=n;i>0;i=i/10){
			mult=mult*10;
		}
		if((sqr % mult )==n){
			System.out.println("Is automorphic");
		}else{
			System.out.println("Is not automorphic");
		}
	}
}
