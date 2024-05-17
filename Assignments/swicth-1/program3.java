/*Write a program in which user should enter two numbers if both the numbers are positive multiply them and provide to switch case to verify number is even or odd, if user enters any negative number program should terminate saying "Sorry negative numbers not allowed" */

import java.io.*;

class switch_demo{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		do{
		System.out.println("Enter Number: ");

		int num1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number: ");

		int num2=Integer.parseInt(br.readLine());


		if(num1 >=0  && num2>=0){
			int input=(num1*num2) & 1;
			switch(input){
				case 1:
					System.out.println("odd number");
					break;
				default:
					System.out.println("even number");
					break;
			}
			break;
		}else{
			System.out.println("Please Enter positive value");

		}
		}while(true);
	}
}
