/*  -Take integer A  as input
 *  -print the fizz if it is divisible by 3 
 *  -print the buzz if it is divisible by 5
    -print the fizz-buzz if it is divisible by both
    if not it is Not divisible by both
 */

class Fizz_Buzz{

	public static void main(String args[]){
		int x=15;

		if((x%3 ==0) && (x%5==0)){
			System.out.println("Fizz-Buzz");
		}else if(x%3==0){
			System.out.println("Fizz");
		}else if(x %5==0){
			System.out.println("Buzz");
		}else{
			System.out.println("Not divisible by both");
		}

	}
}
