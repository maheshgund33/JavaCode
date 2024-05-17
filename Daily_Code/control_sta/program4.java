/* -Given the temp of a person in farenhit
 * -print whether the person has high ,normal,Low*/

class Temp{

	public static void main(String args[]){

		float temp= 92.7f;

		if(temp > 98.6f){
			System.out.println("High");
		}else if(temp<98.0f){
			System.out.println("Low");
		}else{
			System.out.println("Normal");
		}
	}
}
