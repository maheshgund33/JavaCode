

import java.util.*;
class Demo{


	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Start code");
/*
		if(num==0)
			throw new ArithmeticException("Zero nako tako");

		System.out.println(10/num);*/	
		try{
			if(num == 0){
				throw new ArithmeticException("Zero nako taku na bhava");
			//	num=1;   unreacheble statement
			}

			System.out.println(10/num);
		}catch(ArithmeticException | NumberFormatException obj2){

			System.out.println(obj2);
		

		}
		System.out.println("End code");
	}
}
