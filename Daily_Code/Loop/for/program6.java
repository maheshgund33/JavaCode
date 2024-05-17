//Fibonaci seris

class Fibonaci{

	public static void main(String args []){

		int N=5;
		int a=0;
		int b=1;

		for(int i=N;i>=0;i--){
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(" ");
	}
}

