//userDefined Exception
import java.util.*;
class UnderFlowException extends RuntimeException{

	UnderFlowException(String msg){
		super(msg);
	}
}
class OverFlowException extends RuntimeException{

	OverFlowException(String msg){
		super(msg);
	}
}

class Client{

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		int data=0;
		int arr[]=new int [5];

		for(int i=0;i<arr.length;i++){
			data=sc.nextInt();
			if(data >100){
				throw new OverFlowException("Number is Greater than 100");
			}
			if(data<0)
				throw new UnderFlowException("Number is less than 0");
			arr[i]=data;
		}
	}
}



