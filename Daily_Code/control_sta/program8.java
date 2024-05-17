// Electric Bill problem
// if units are less than 100 1 per unit
// else 2 per unit


class Bill{
	
	public static void main(String args[]){

		int units=200;

		if(units <= 100){
			System.out.println(units);
		}else{
			System.out.println(100+(units-100)*2);
		}
	}
}

